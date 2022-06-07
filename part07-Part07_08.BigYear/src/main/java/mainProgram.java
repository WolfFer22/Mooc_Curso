
import java.util.ArrayList;
import java.util.Scanner;

public class mainProgram {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);        
        
        ArrayList<Birds> birdList = new ArrayList<>();
        BirdDataBase birds = new BirdDataBase(birdList);
        
        UserInterface ui = new UserInterface(scan, birds);
        ui.start();
        
    }  
    
}
