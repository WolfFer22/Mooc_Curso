
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        
        // This exercise is worth five exercise points, and it is 
        // gradually extended part by part.
        
        // If you want, you can send this exercise to the server
        // when it's just partially done. In that case the server will complain about 
        // the parts you haven't done, but you'll get points for the finished parts.
        
        Scanner scanner = new Scanner(System.in);       
        
        System.out.println("Give numbers:");
        
        double  average = 0.0;
        int sum = 0, numbNumbers = 0, even = 0, odd = 0;         

        while (true) {  
            
            int number = scanner.nextInt(); // ler número introduzido
            
            if (number == -1) { // declarar condição de fecho do loop se introduzido -1
                System.out.println("Thx! Bye!");
                break;
            } // end if 
            
            sum += number; // soma dos números introduzidos até escrever -1
            
            numbNumbers++; // número de números introduzidos
            
            average = 1.0 * sum / numbNumbers; // média dos números introduzidos           
            
            if ((number % 2) == 0) { // verificação de números pares && impares
                even++;
            } else {
                odd++;
            }
                        
        } // end while loop
        
        // Escrever resultados:
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + numbNumbers);
        System.out.println("Average: " + average);
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);
        
    } // end main
    
} // end class
