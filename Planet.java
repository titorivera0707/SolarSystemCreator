import java.io.*;
import java.util.*;

public class Planet{

    public static Random randyPlanet = new Random();
    private String planetName;
    private int planetTons;

    public Planet(){
        super();
        setPlanetName("Unknown");
    }

    public Planet(String planetName) {
        super();
        setPlanetName(planetName);
        setPlanetTons(10000000);
    }

    public String getPlanetName() {
        return planetName;
    }

    public void setPlanetName(String planetName) {
        this.planetName = planetName;
    }

    public int getPlanetTons() {
        return planetTons;
    }

    // public boolean equals(Planet planetZero, int weightZero) {
    //     if(firstPlan.equals(secondPlan) && firstWeight == secondWeight) return true;
    //     else return false;
    // }

    public void setPlanetTons(int planetTons) {
        planetTons += randyPlanet.nextInt(70000000);
        this.planetTons = planetTons;
    }

    @Override
    public String toString(){
        int planetTonsNew = planetTons;
        return String.format("The planet named %s weighs %,d tons.\n", planetName, planetTonsNew);
    }

}