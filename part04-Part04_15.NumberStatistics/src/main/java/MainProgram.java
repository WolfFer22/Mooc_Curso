
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Statistics statistics = new Statistics();
        Statistics evenStatistics = new Statistics();
        Statistics oddStatistics = new Statistics();
        
        System.out.println("Enter numbers:");
        
        while(true){          
            int input = scanner.nextInt();
            if (input == -1){
                break;
            }            
            statistics.addNumber(input); 
            
            if (input % 2 == 0){
                evenStatistics.addNumber(input);
            } else {
                oddStatistics.addNumber(input);
            }
            
        }
        System.out.println("Count: " + statistics.getCount());
        System.out.println("Average: " + statistics.average());
        System.out.println("Sum: " + statistics.sum());       
    
        
        System.out.println("Sum of even numbers: " + evenStatistics.sum());
        

        System.out.println("Sum of odd numbers: " + oddStatistics.sum());
    
    }
}

