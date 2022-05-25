
import java.util.ArrayList;

public class Suitcase {

    private int maximumWeight;
    private ArrayList<Item> items = new ArrayList<>();

    public Suitcase(int maximumWeight) {
        this.maximumWeight = maximumWeight;
    }

    public void addItem(Item item) {
        items.add(item);                    //add to the list
        
        int sumOfWeights = 0;               //verify maximum capacity Suitcase
        for (Item it : items) {            
            sumOfWeights += it.getWeight();
        } 
        if (sumOfWeights > maximumWeight){
            items.remove(item);
        }        
    }

    public int totalWeight(){                //calculate sum of total Weight
        int sumOfWeights = 0;        
        for (Item it : items) {            
            sumOfWeights += it.getWeight();
        }
        return sumOfWeights;
    }
    
    public Item heaviestItem(){
        if (items.isEmpty()){                 //verify if list is empty
            return null;
        }
        
        Item heaviest = items.get(0);         //verify the heaviest  Suitcase on the list
        for (Item it : items) {            
            if (it.getWeight() > heaviest.getWeight()){
                heaviest = it;
            }
        }        
        return heaviest;
    }
    
    public void printItems(){              
        for (Item item : items) {             //print the items           
            System.out.println(item.getName()+ " (" + item.getWeight() + " kg)");
        } 
        
    }    

    public ArrayList<Item> getItems() {
        return items;
    }
    

    @Override
    public String toString(){
        
        if (items.isEmpty()){
            return "no items (0 kg)";
        }
        if (items.size() == 1){
            return items.size() + " item (" + totalWeight() + " kg)";
        }
        return  items.size() + " items (" + totalWeight() + " kg)";
    }
    
}
