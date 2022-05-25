
import java.util.Scanner;

public class UserInterface {
    
    private TodoList userInput;
    private Scanner scanner;

    public UserInterface(TodoList userInput, Scanner scanner) {
        this.userInput = userInput;
        this.scanner = scanner;
    }
    
    public void start(){
        while(true) {           
            System.out.println("Command: ");
            String command = scanner.nextLine();
            if (command.equals("stop")){
                break;
                
            } 
            else if (command.equals("add")){
                add();
            
            } 
            else if (command.equals("remove")){
                remove();
                
            } 
            else if (command.equals("list")){
                list();
            }
        }        
    }
    
    public void add(){
        
        System.out.println("To add:");
        String input = scanner.nextLine();
        userInput.add(input);
    }
    
    public void remove(){
        
        System.out.println("Which one is removed?");
        int indexTask = scanner.nextInt();
        userInput.remove(indexTask);
    }
    
    public void list(){
        
        userInput.print();
    }
    
}
