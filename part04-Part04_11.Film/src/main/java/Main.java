
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        // Test your Film class here
        Scanner reader = new Scanner(System.in);
        
        Film chipmunks = new Film("ALvin and the Chipmunks: The Squeakquel", 0);
        
        System.out.println("How old are you?");
        int age = reader.nextInt();
        
        System.out.println();
        if (age >= chipmunks.ageRating()) {
            System.out.println("You may watch the film " + chipmunks.name());
        } else {
            System.out.println("You may not watch the film " + chipmunks.name());
        }
    }
}
