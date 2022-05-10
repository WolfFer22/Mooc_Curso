
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("File? ");
        String file = scanner.nextLine();
        
        System.out.println("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        
        System.out.println("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());
        
        ArrayList <Integer> list = new ArrayList<>();
        
        try (Scanner scan = new Scanner(Paths.get(file))){
            
            while (scan.hasNextLine()){
                list.add(Integer.valueOf(scan.nextLine()));
            }                
            
        } catch (Exception ex) {
            System.out.println("Reading the file " + file + " failed.");
        }
        
        int count = 0;
        for (Integer lisForLoop: list){   
            
            if (lisForLoop >= lowerBound && lisForLoop <= upperBound){                              
                count++;
            }            
        }
        System.out.println("Numbers: " + count);

    }
}
