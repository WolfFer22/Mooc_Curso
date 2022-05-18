
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList <Archives> list = new ArrayList <>();             
                
        while(true){        
            System.out.println("Identifier? (empty will stop)");
            String identifier = scanner.nextLine();
            if (identifier.isEmpty()){
                break;
            }          
            
            System.out.println("Name? (empty will stop)");
            String name = scanner.nextLine();
            if (name.isEmpty()){
                break;
            }                        
           
            Archives archive = new Archives(identifier, name);
            
            if (!list.contains(archive)){
                list.add(archive);              
            }                                                                  
        }
        
        System.out.println("==Items==");
        
        for(Archives archive: list){
            System.out.println(archive);
        }

    }
}
