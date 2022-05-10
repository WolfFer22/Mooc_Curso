
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();
        
        ArrayList <String> list = new ArrayList<>();
        
        try (Scanner scan = new Scanner(Paths.get(file))){
            
            while (scan.hasNextLine()){
                list.add(scan.nextLine());
            }                
            
        } catch (Exception ex) {
            System.out.println("Reading the file " + file + " failed.");
        }
        
        System.out.println("");
        
        if (list.contains(searchedFor)){
            System.out.println("Found!");
        } else {
            System.out.println("Not found.");
        }

    }
}
