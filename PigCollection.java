package Farm;

public class PigCollection {
//variables
    private int size;
    private int initialSize = 5;
    private static Pig[] pigArray;

    public PigCollection() {
        pigArray = new Pig[initialSize];
    }
//increase the size of array
    private void expand() {
        int newInitialSize = initialSize *2;
        Pig[] newArray = new Pig[newInitialSize];

        if (size >= 0) System.arraycopy(pigArray, 0, newArray, 0, size);
       initialSize = newInitialSize;
        pigArray = newArray;
    }
//         A method called addPig for adding a new pig but it does not have a method for removing pig
    public void addPig(Pig add) {
        if (size >= initialSize) {
            expand();
        }
        pigArray[size] = add;
        size++;
    }

    public static Pig[] getPigArray() {
        return pigArray;
    }

    // return the no of pig given
    public int getPigCount() {
        return size;
    }
//check array if it is empty or not
    public boolean isEmpty() {
        return size == 0;
    }
//return array of all pigs
    public String getPigList() {
        StringBuilder string = new StringBuilder();

        for(int i = 0; i < size; i++) {
            string.append(pigArray[i].getName()).append(", ");
        }
        if (!string.toString().equals("")) {
            string = new StringBuilder("[" + string.substring(0, string.length() - 2) + "}");
        }else {
            string = new StringBuilder("[]");
        }
        return string.toString();
    }
}
