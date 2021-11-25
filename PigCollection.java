package Farm;

public class PigCollection {
//variables
    private int size;
    private int initialSize = 5;
    private Pig[] pigArray;

    public PigCollection(Pig[] pigArray) {
        this.pigArray = new Pig[initialSize];
    }
//increase the size of array
    private void expand() {
        int newInitialSize = initialSize *2;
        Pig[] newArray = new Pig[newInitialSize];

        for (int i = 0; i < size; i++) {
            newArray[i] = pigArray[i];
        }
       initialSize = newInitialSize;
    }
//         A method called addPig for adding a new pig but it does not have a method for removing pig
    public void addPig(Pig add) {
        if (size >= initialSize) {
            expand();
        }
        pigArray[size] = add;
        size++;
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
        String string = "";

        for(int i = 0; i < size; i++) {
            string += pigArray[i].getName() + ", ";
        }
        if (!string.equals("")) {
            string = "[" + string.substring(0, string.length() -2) + "}";
        }else {
            string = "[]";
        }
        return string;
    }
}
