import java.util.*;
import java.io.*;

public class SolarSystem{

    private String solSystemName;
    private Sun sol;
    private ArrayList<Planet> planetList = new ArrayList<Planet>();
    private String getUserFile;

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

    public void setGetUserFile(String getUserFile) {
        this.getUserFile = getUserFile;
    }

    //Takes user input for the path of the file that will be used for the planets. Creates the planets
    public void createPlanets()throws FileNotFoundException{
        Scanner keyboard = new Scanner(System.in);
        Scanner openFile = new Scanner(fileChecker());
        while(openFile.hasNext()){
            Planet newPlan = new Planet(openFile.next());
            planetList.add(newPlan);
        }
        openFile.close();
        keyboard.close();

    }

    public File fileChecker(){
        Scanner newKey = new Scanner(System.in);
        File newUserFile = new File("");
        do{
            System.out.println(String.format("Please enter the name of the input file: "));
            String fileName = newKey.nextLine();
            File tempFile = new File(fileName);
            if(tempFile.exists()){
                newUserFile = tempFile;
                continue;
            }else{
                System.out.println("File does not exist. Please try again.");
            }
        }while(!newUserFile.exists());
        return newUserFile;
    }

    public int getNumPlanets(){
        return planetList.size();
    }

    //Gets the planet at a certain index.
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