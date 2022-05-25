
import java.util.ArrayList;

public class Room {
    
    ArrayList<Person> persons = new ArrayList<>();

    public Room() {
    }
    
    public void add(Person person){
        persons.add(person);
    }
    
    public boolean isEmpty(){        
        return persons.isEmpty();
    }
    
    public ArrayList<Person> getPersons(){
        return persons;
    }
    
    public Person shortest(){
        if (persons.isEmpty()){
            return null;
        }
        
        Person toReturn = persons.get(0);
        
        for(Person pers: persons){
            if (pers.getHeight() < toReturn.getHeight()){
                toReturn = pers;
            }
        }
        return toReturn;
    }
    
    public Person take(){
        if (persons.isEmpty()){
            return null;
        }
        
        Person toRemove = shortest();        
        persons.remove(toRemove);            
        
        return toRemove;
    }

}
