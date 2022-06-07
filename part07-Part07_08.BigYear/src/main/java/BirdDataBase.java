
import java.util.ArrayList;


public class BirdDataBase {
    private ArrayList<Birds> birdList;

    public BirdDataBase(ArrayList<Birds> birdList) {
        this.birdList = birdList;
    }

    public ArrayList<Birds> getBirdList() {
        return birdList;
    }
    
    public void addBird(String name, String latinName){
        Birds b = new Birds(name, latinName);
        this.birdList.add(b);
    }
    
    public void printOneBird(String name){
        for (Birds b : birdList){
            if (b.getName().contains(name)){
                System.out.println(b);
            } else {
                System.out.println("Not a bird!");
            }
        }
    }
    
    public void printAllBirds() {
        if (birdList.isEmpty()){
            System.out.println("Bird list is empty.");
        } else {
            for(Birds bb : birdList){
            System.out.println(bb);
            }
        }
        
    }
    
    public void getObservation(String name) {
        for (Birds b : birdList){
            if (b.getName().contains(name)){
                b.wasObservated();
            } else {
                System.out.println("Not a bird!");
            }
        }
    }
}
