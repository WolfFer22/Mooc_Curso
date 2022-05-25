
import java.util.ArrayList;
import java.util.Random;

public class JokeManager {
    
    private ArrayList<String> jokes;
    
    public JokeManager() {
        this.jokes= new ArrayList<>();
    }
    
    public void addJoke(String joke){
        jokes.add(joke);
    }
    
    public String drawJoke(){
        if (jokes.isEmpty()){
            return "Jokes are in short supply.";
        }
        
        Random rand = new Random();                
        
        return jokes.get(rand.nextInt(jokes.size()));
    }
    
    public void printJokes(){        
        for (String listJokes : jokes){
            System.out.println(listJokes);
        }
    }
}
