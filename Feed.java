package Farm;

public class Feed {

    //A private static int variable keeping track of the amount of feed that the farmer has in terms of number of bins
    private String feedName;
    private boolean isFull;
    private double weight;

//    getters and setters
    public String getFeedName() {
        return feedName;
    }

    public void setFeedName(String feedName) {
        this.feedName = feedName;
    }

    public boolean isFull() {
        return isFull;
    }

    public void setFull(boolean full) {
        isFull = full;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    //A constructor that accepts a parameters: A String type for name of feed
    Feed(String feedName_f) {
        feedName = feedName_f;
    }
    // A public method called add which receives an int value and adds that to the number of bins
    public void add(int addBin) {
        binCount += addBin;
    }
}
