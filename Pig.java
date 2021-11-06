package Farm;
import java.util.Date;

public class Pig {

    private static int track = 0;   // a private static variable keeping track of the number of pig in the farm

    private boolean isFemale;
    private String name, color, sex;
    private Date dateOfBirth;

    // A static public method named getCount
    public static int getCount() {
        return track;
    }

    //getter
    public String getName() {
        return name;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public String getSex() {
        return sex;
    }

    public String getColor() {
        return color;
    }

    //A public method called isFemale that return true if pig is female
    public boolean isFemale() {
        return false;
    }
    //Color of pig, name of pig, sex adn date of birth of the pigs which is a string set when initialized using the constructor
    Pig(String name_n, String color_c, String sex_s, Date dateOfBirth_d) {
        name = name_n;
        sex = sex_s;
        color = color_c;
        dateOfBirth = dateOfBirth_d;
    }
    //A method feed that accepts an object of type Feed and calls the method
    public void feed(Feed foodNo) {
        foodNo.consume();
    }
}
