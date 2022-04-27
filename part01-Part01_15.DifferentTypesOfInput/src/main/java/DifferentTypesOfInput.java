
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Give a string:");
        String valor1= scan.nextLine();
        
        System.out.println("Give an integer:");
        int valor2 = Integer.valueOf(scan.nextLine());
        
        System.out.println("Give a double:");
        double valor3 = Double.valueOf(scan.nextLine());
        
        System.out.println("Give a boolean:");
        boolean valor4 = Boolean.valueOf(scan.nextLine());
        
        System.out.println("You gave the string " + valor1);
        System.out.println("You gave the integer " + valor2);
        System.out.println("You gave the double " + valor3);
        System.out.println("You gave the boolean " + valor4);

    }
}
