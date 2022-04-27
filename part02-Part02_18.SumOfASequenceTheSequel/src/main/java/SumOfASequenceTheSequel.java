
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("First number?");
        int start = scanner.nextInt();
        
        System.out.println("Last number?");
        int end = scanner.nextInt();
        
        int sum = 0;
        
//        for (int i = inicio; i <= fim; i++) {
//            sum += i;
//        }          
//        System.out.println("The sum is: " + sum);
        
        while (end >= start) {
            sum += start; //  || sum = sum + inicio;
            start += 1; //  || inicio = inicio + 1; || inicio++;
        }
        System.out.println("Sum is: " + sum);
    }
}
