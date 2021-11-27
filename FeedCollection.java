package Farm;

public class FeedCollection {

//    variables
    public static final int SIZE = 20;
    private Feed[] feedArray = new Feed[SIZE];

//    getters and setters

    public Feed[] getFeedArray() {
        return feedArray;
    }

    public void setFeedArray(Feed[] feedArray) {
        this.feedArray = feedArray;
    }

    public void setFeedlocation (int location, Feed feed) {
        try{
            feed = feedArray[location]  ;
        } catch (Exception e) {
            System.out.println("All the bins are full. \nMaximum size: " + SIZE);
        }
    }

//    set feed bin to empty
    public void emptyFeedNumber(int id) {
        feedArray[id]. consume();
    }
//    return full feed bins
    public int fullBinsNo () {
        int counter = 0;
        for (int i = 0; i < SIZE; i++) {
            if (feedArray[i] != null && feedArray[i].isFull()) {
                counter++;
            }
        }
        return counter;
    }
//    return available feed bin
public Feed getNextBin() {
    for (int i = 0; i < SIZE; i++) {
        if (feedArray[i] != null && feedArray[i].isFull()) {
            return feedArray[i];

        }
    }
    return null;
}

    public void setFeedNumber(int numBin, Feed newFeed) {
    }

    public FeedCollection() {
    }

    public int getSize() {
        return SIZE;
    }
}
