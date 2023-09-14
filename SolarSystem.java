import java.util.*;
import java.io.*;

public class SolarSystem{

    private String solSystemName;
    private Sun sol;
    private ArrayList<Planet> planetList = new ArrayList<Planet>();

    public SolarSystem(){
        super();
        setSolSystemName("unknown");
        this.sol = new Sun();
    }

    public SolarSystem(String solSystemName, String sunName)throws FileNotFoundException{
        super();
        setSolSystemName(solSystemName);
        this.sol = new Sun(sunName);
        createPlanets();
    }

    public void createPlanets()throws FileNotFoundException{
        Scanner keyboard = new Scanner(System.in);
        File newFile = new File("./planets.txt");
        Scanner openFile = new Scanner(newFile);
        while(openFile.hasNext()){
            Planet newPlan = new Planet(openFile.next());
            planetList.add(newPlan);
        }

    }

    public int getNumPlanets(){
        return planetList.size();
    }

    public Planet getPlanet(int planetIndex){
        if(planetIndex < 0 || planetIndex > planetList.size()){
            return null;
        } else{
            return planetList.get(planetIndex);
        }
    }

    public String getSolSystemName() {
        return solSystemName;
    }

    public void setSolSystemName(String solSystemName) {
        this.solSystemName = solSystemName;
    }

    @Override
    public String toString(){
        String forString = "";
        for(Planet x: planetList)forString += x.toString();

        return "The name of this solar system is "+solSystemName+".\n"+sol.toString()+forString;
    }

}