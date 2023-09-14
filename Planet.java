import java.io.*;
import java.util.*;

public class Planet{

    private static Random randyPlanet = new Random();
    private String planetName;
    private int planetTons;

    public Planet(){
        super();
        setPlanetName("Unknown");
    }

    public Planet(String planetName) {
        super();
        randyPlanet.setSeed(7);
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

    public void setPlanetTons(int planetTons) {
        planetTons += randyPlanet.nextInt(70000000);
        this.planetTons = planetTons;
    }

    @Override
    public String toString(){
        return String.format("The planet named %s weighs %,d tons.\n", planetName, planetTons);
    }

}