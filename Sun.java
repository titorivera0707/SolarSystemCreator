import java.io.*;
import java.util.*;

public class Sun {

    private String sunName;
    private int sunAge;
    public Random randy = new Random(4);

    public Sun(){
        super();
        setSunName("unknown");;
    }

    public Sun(String sunName){

        super();
        setSunName(sunName);
        setSunAge(1000000000);

    }

    public String getSunName() {
        return sunName;
    }

    public void setSunName(String sunName) {
        this.sunName = sunName;
    }

    public int getSunAge() {
        return sunAge;
    }

    public void setSunAge(int sunAge) {
        sunAge += randy.nextInt(1000000000);
        this.sunAge = sunAge;
    }

    @Override
    public String toString() {
        return String.format("The sun named %s is %,d years old.\n", sunName, sunAge);
    }

}