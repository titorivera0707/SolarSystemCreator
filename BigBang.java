import java.io.*;
import java.util.*;

public class BigBang{

    public static void main(String[] args)throws FileNotFoundException{

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter the name of the Solar System: ");
        String solSysName = keyboard.nextLine();
        System.out.println("Please eneter the name of the Sun: ");
        String sunName = keyboard.nextLine();

        SolarSystem newSolSystem = new SolarSystem(solSysName, sunName);

        System.out.println(newSolSystem);
            

    }

}