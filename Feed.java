package Farm;

public class Feed {

    //A private static int variable keeping track of the amount of feed that the farmer has in terms of number of bins
    private static int binCount;

    private final String feedName;

    //A static public method named getAmount() that returns how many bins of feed are left
    public static int getAmount() {
        binCount = 0;
        return binCount;
    }

    public String getFeedName() {
        return feedName;
    }

    //A public method called consume that decreases feed amount by 1, and show error if there is no food bins left
    public static void consume() {
        if (binCount > 0) {
            binCount--;
        }else{
            System.out.println("There is no food bins left to feed.");
        }
    }
    //A constructor that accepts two parameters: A String type for name of feed and int value for no of bins
    Feed(String feedName_f, int binCount_b) {
        feedName = feedName_f;
        binCount = binCount + binCount_b;
    }
    // A public method called add which receives an int value and adds that to the number of bins
    public void add(int addBin) {
        binCount += addBin;
    }
}
