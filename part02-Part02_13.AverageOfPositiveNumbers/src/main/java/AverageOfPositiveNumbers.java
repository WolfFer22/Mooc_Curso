
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double countPositive = 0;
        double averagePositive = 0;
        double sum = 0;
        
        while(true) {
            System.out.println("Give a number:");
            double number = Double.valueOf(scanner.nextLine());                                          
            
            if (number == 0) {
                break;
            }
            
            if (number > 0) {
                countPositive += 1;
                sum = sum + number;
            }
            
        }
        if (countPositive > 0) {
            averagePositive = sum / countPositive;
            System.out.println(averagePositive);            
        } else {
            System.out.println("Cannot calculate the average");        
        }
                
    }
}
