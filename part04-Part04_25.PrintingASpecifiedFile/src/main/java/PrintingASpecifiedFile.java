
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingASpecifiedFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which file should have its contents printed?"); 
        
        String fileName = scanner.nextLine();
        
        printFile(fileName);    

    }
    
    public static void printFile(String fileName){
        
        try (Scanner scan = new Scanner(Paths.get(fileName))) {
            
            while(scan.hasNextLine()){
                String textRow = scan.nextLine();
                System.out.println(textRow);
            }            
            
        } catch (Exception ex) {
            System.out.println("Error: " + ex);
        }
    }
}
