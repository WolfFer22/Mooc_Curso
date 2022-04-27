
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int count = 0, sum = 0;
        double average = 0;
                
        while(true) {
            System.out.println("Give a number:");
            int number = scanner.nextInt();                                          
            
            if (number == 0) {
                break;
            } else {
                count += 1;
                sum = sum + number;
            }
                       
        }
        average = sum / count;
        System.out.println("Average of the numbers: " + average);            
        
    }
}
