
import java.util.Scanner;

public class UserInterface {
    
    private JokeManager manager;
    private Scanner scan;

    public UserInterface(JokeManager manager, Scanner scan) {
        this.manager = manager;
        this.scan = scan;
    }
    
    public void start(){
        while(true){
            System.out.println("Commands: ");
            String command = scan.nextLine();
            
            if (command.equals("X")){
                break;
            }
            
            else if (command.equals("1")){
                System.out.println("Write the joke to be added:");                
                manager.addJoke(scan.nextLine());
            }
            
            else if(command.equals("2")){
                System.out.println(manager.drawJoke());
            }
            
            else if (command.equals("3")){
                System.out.println("Printing the jokes.");
                manager.printJokes();
            }
                        
        }
    }
    
}
