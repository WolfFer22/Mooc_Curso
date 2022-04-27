
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String user1 = "alex";
        String pass1 = "sunshine";
        
        String user2 = "emma";
        String pass2 = "haskell";
        
        System.out.println("Enter username: ");
        String userPrompt = scanner.nextLine();
        System.out.println("enter password: ");
        String passPrompt = scanner.nextLine();
        
        if (userPrompt.equals(user1) && passPrompt.equals(pass1)){
            System.out.println("You have successfully logged in!"); 
        } else if (userPrompt.equals(user2) && passPrompt.equals(pass2)){
            System.out.println("You have successfully logged in!");
        } else {
            System.out.println("Incorrect username or password!"); 
        }

    }
}
