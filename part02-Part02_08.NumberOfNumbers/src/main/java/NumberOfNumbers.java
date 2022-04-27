
import java.util.Scanner;

public class NumberOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int sumNumbers = 0;
        
        while (true) {
            System.out.println("Give a number:");
            int number = scanner.nextInt();
            if (number != 0) {
                sumNumbers = sumNumbers + 1; // adding 1 to the counter
                //sumNumbers += 1, different form of adding 1
                //sumNumbers ++, other form of adding 1
                
            } else if (number == 0){
                break;
            }
        }
        
        System.out.println("Number of numbers: " + sumNumbers);
        
    }
}
