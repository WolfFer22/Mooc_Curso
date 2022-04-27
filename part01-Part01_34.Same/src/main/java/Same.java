
import java.util.Scanner;

public class Same {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the first string:");
        String texto1 = scan.nextLine();
        System.out.println("Enter the second string:");
        String texto2 = scan.nextLine();
        
        if (texto1.equals(texto2)){
            System.out.println("Same");
        } else {
            System.out.println("Different");
        }
        
    }
}
