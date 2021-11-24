package Farm;
import java.util.Date;

public class Pig {

    private static int track = 0;   // a private static variable keeping track of the number of pig in the farm

    private boolean isFed;
    private String name, color, sex, PigID;
    private Date dateOfBirth;
//getter & setters
    
    public static int getTrack() {
        return track;
    }
    
    public static void setTrack(int track) {
        Pig.track = track;
    }

    public boolean isFed() {
        return isFed;
    }

    public void setFed(boolean fed) {
        isFed = fed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getPigID() {
        return PigID;
    }

    public void setPigID(String pigID) {
        PigID = pigID;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    //Color of pig, name of pig, sex adn date of birth of the pigs which is a string set when initialized using the constructor
    Pig(String name_n, String color_c, String sex_s, Date dateOfBirth_d, String PigID_p) {
        name = name_n;
        sex = sex_s;
        color = color_c;
        dateOfBirth = dateOfBirth_d;
        PigID = PigID_p;
    }
    //A method feed that accepts an object of type Feed and calls the method
    public void feed(Feed foodNo) {
        foodNo.consume();
    }
}
