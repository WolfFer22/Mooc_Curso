
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int firstContainer = 0;
        int secondContainer = 0;

        while (true) {          
            
            System.out.println("First: " + firstContainer + "/100");
            System.out.println("Second: " + secondContainer + "/100");
            
            String input = scan.next();
            
            if (input.equals("quit")) {                 
                break;
                
            } 
            
            if (input.equals("add")) {                
                int add = scan.nextInt();

                if (add > 0) {
                    firstContainer += add;

                    if (firstContainer > 100) {
                        firstContainer = 100;
                    }                    
                }                

            }
            
            if (input.equals("move")) {                
                int move = scan.nextInt();

                if (move > 0) {                    
                    if (move > firstContainer){
                        secondContainer -= firstContainer;
                        firstContainer = 0;   
                        
                    } else {
                        secondContainer += move;
                        firstContainer -= move;

                        if (secondContainer > 100) {
                            secondContainer = 100;
                        }
                    }                                        
                }                

            }
            
            if (input.equals("remove")) {                
                int remove = scan.nextInt();
                
                if (remove > 0){
                    secondContainer -= remove;

                    if (secondContainer < 0) {
                        secondContainer = 0;
                    }                    
                }                
            }            
        }   
        
    }
    
}
