
import java.util.Scanner;

public class TextUI {
    private Scanner scanner;
    private SimpleDictionary dictionary;    

    public TextUI(Scanner scanner, SimpleDictionary dictionary) {
        this.scanner = scanner;
        this.dictionary = dictionary;
    }
    
    public void start(){

        while(true){    
            
            System.out.println("Command: ");
            String commands = scanner.nextLine();
            
            if (commands.equals("end")) {                
                break;
            }
            
            else if (commands.equals("add")) {
                
                System.out.println("Word: ");
                String word = scanner.nextLine();
                
                System.out.println("Translation: ");
                String translaction = scanner.nextLine();                
                
                dictionary.add(word, translaction);

            }
            
            else if (commands.equals("search")) {
                
                System.out.println("Word: ");
                String word = scanner.nextLine();  
                if (dictionary.translate(word) == null){
                    System.out.println("Word " + word + " was not found");                    
                } else {
                    System.out.println(dictionary.translate(word)); 
                }    
                
            }            
            
            else {
                System.out.println("Unknown command");
            }

        }
        System.out.println("Bye bye!");
    }
    
}
