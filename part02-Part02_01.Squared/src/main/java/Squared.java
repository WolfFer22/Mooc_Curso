
import java.util.Scanner;

public class Squared {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Give a number:");
        int first = scanner.nextInt();
        int square = first * first;
        
        System.out.println("The square of the number is: " + square);

    }
}
