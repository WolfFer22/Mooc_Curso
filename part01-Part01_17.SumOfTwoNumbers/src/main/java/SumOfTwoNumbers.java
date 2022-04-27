
import java.util.Scanner;

public class SumOfTwoNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Give the first number:");
        int number1 = Integer.valueOf(scanner.nextLine()); //user give 1st number
        
        System.out.println("Give the second number:");
        int number2 = Integer.valueOf(scanner.nextLine()); //user give 2nd number
        
        int sum = number1 + number2; //sum operation
        System.out.println("The sum of the numbers is " + sum);
        
    }
}
