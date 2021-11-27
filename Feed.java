package Farm;

public class Feed {
    private String feedName;
    private boolean isFull;
    private double weight;

    public boolean isFull() {
        return this.isFull;
    }

    public void setFull(boolean full) {
        this.isFull = full;
    }

    public double getWeight() {
        return this.weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getFeedName() {
        return this.feedName;
    }

    public void setFeedName(String feedName) {
        this.feedName = feedName;
    }

    public void consume() {
        this.isFull = false;
    }

    Feed(String feedName_f) {
        this.feedName = feedName_f;
    }
}
