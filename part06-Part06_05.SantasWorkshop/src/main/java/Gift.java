
public class Gift {
    
    private String name;
    private int weight;
    
    public Gift (String newName, int newWeigth){
        this.name = newName;
        this.weight = newWeigth;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }
    
    public String toString(){
        return name + " (" + weight + " kg)";
    }
    
}
