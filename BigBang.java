import java.io.*;
import java.util.*;

public class BigBang{

    public static void main(String[] args)throws FileNotFoundException{

        //Gets the information from the user.

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter the name of the Solar System: ");
        String solSysName = keyboard.nextLine();
        System.out.println("Please eneter the name of the Sun: ");
        String sunName = keyboard.nextLine();

        //Creates the SolarSystem and Planets.
        SolarSystem newSolSystem = new SolarSystem(solSysName, sunName);
        String firstPlanet = newSolSystem.getPlanet(0).toString();
        Planet comparePlanets = new Planet();
        boolean tester = false;
        int counter = 1;

        //Checks if there is a planet that matches the first planet in the arrayList.
        for(int x = 1; x < newSolSystem.getNumPlanets(); x++){
            if(comparePlanets.equals(firstPlanet, newSolSystem.getPlanet(x).toString()) == true){
                tester = true;
                counter += x;
            }
        }

        System.out.println(newSolSystem);
        
        if(tester == false){
            System.out.println("There is no planet that matches the first planet.");
        }

        System.out.println(String.format("%s It equals planet %d in the ArrayList", firstPlanet, counter));


    }

}