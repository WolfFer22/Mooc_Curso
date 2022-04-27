
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);        
        
        while(true){
            
            String input = scanner.nextLine();
            String[] inputSplit = input.split(" ");
            
            if (input.equals("")){
                break;
            }
            
            for( String avCheck : inputSplit){
                if (avCheck.contains("av")){                    
                    System.out.println(avCheck);  
                }              
            }                          
        }          
    }
}
