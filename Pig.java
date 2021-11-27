//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package Farm;

import java.time.LocalDate;

public class Pig {
    private static int track = 0;
    private boolean isFed;
    private String name;
    private String color;
    private char sex;
    private String PigID;
    private LocalDate dateOfBirth;

    public static int getTrack() {
        return track;
    }

    public static void setTrack(int track) {
        Pig.track = track;
    }

    public boolean isFed() {
        return this.isFed;
    }

    public void setFed(boolean fed) {
        this.isFed = fed;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getSex() {
        return this.sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public String getPigID() {
        return this.PigID;
    }

    public void setPigID(String pigID) {
        this.PigID = pigID;
    }

    public LocalDate getDateOfBirth() {
        return this.dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    Pig(String name_n, String color_c, char sex_s, LocalDate dateOfBirth_d, String PigID_p) {
        this.name = name_n;
        this.color = color_c;
        this.sex = sex_s;
        this.dateOfBirth = dateOfBirth_d;
        this.PigID = PigID_p;
    }

    public void feed(Feed foodNo) {
        foodNo.consume();
    }
}
