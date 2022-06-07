
import java.awt.BorderLayout;
import java.util.Scanner;

public class UserInterface {

    private Scanner scan;
    private BirdDataBase birds;

    public UserInterface(Scanner scan, BirdDataBase birds) {
        this.scan = scan;
        this.birds = birds;
    }

    public void start() {
        
        while (true) {
            System.out.println("?");
            String command = scan.nextLine();
            
            if (command.equals("Quit")){
                break;
                
            } else if (command.equals("Add")){
                System.out.println("Name:");
                String name = scan.nextLine();
                System.out.println("Name in Latin:");
                String nameLatin = scan.nextLine();
                
                birds.addBird(name, nameLatin);
                
            } else if (command.equals("Observation")){
                System.out.println("Bird?");
                String name = scan.nextLine();
                
                birds.getObservation(name);
                
            } else if (command.equals("One")){
                System.out.println("Bird?");
                String name = scan.nextLine();
                
                birds.printOneBird(name);
                
            } else if (command.equals("All")){
                
                birds.printAllBirds();
                
            } else {
                System.out.println("Unkown command");
            }
        }
    }

}
