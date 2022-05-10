
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingAFile {

    public static void main(String[] args) {
        
        try (Scanner scan = new Scanner(Paths.get("data.txt"))){
            
            while (scan.hasNextLine()){
                String linha = scan.nextLine();
                System.out.println(linha);
            }
            
        } catch (Exception nameException){
            System.out.println("Error: " + nameException.getMessage());
        }

    }
}
