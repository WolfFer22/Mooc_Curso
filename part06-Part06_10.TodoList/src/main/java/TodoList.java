
import java.util.ArrayList;

public class TodoList {
    private ArrayList<String> listToDo;

    public TodoList() {
        this.listToDo = new ArrayList<>();
    }
        
    public void add(String task) {                
        listToDo.add(task);        
    }
    
    public void print(){
        int index = 0;
        while (index < listToDo.size()){
            System.out.println((index + 1) + ": " + listToDo.get(index));
            index++;
        }
    }
    
    public void remove(int number){
        int index = number - 1;
        listToDo.remove(index);
    }
}
