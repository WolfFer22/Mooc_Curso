
import java.util.ArrayList;

public class Hold {
    private int maximumWeight; 
    private ArrayList<Suitcase> list = new ArrayList<>();

    public Hold(int maximumWeight) {
        this.maximumWeight = maximumWeight;
    }
    
    public void addSuitcase(Suitcase suitcase){
        list.add(suitcase);                      //add to the list
        
        int sumOfSuitcases = 0;                  //verify maximum capacity Cargo
        for (Suitcase it : list) {            
            sumOfSuitcases += it.totalWeight();
        } 
        if (sumOfSuitcases > maximumWeight){
            list.remove(suitcase);
        }        
    }
    
    public int totalHold(){
        int totalHold = 0;                       //calculate sum of total Weight
        for (Suitcase suitcases: list){          //of Cargo  
            totalHold += suitcases.totalWeight();                
        }
        return totalHold;
    }
    
    public void printItems(){                    //itenerar lista de lista
        for(Suitcase suitcases : list){
            ArrayList<Item> items = suitcases.getItems();
            for (Item itemsInSuitcases : items){
                System.out.println(itemsInSuitcases);
            }
        }
    }    
    
    
    public String toString(){
        return list.size() + " suitcases (" + totalHold() + "kg)";
    }
}
