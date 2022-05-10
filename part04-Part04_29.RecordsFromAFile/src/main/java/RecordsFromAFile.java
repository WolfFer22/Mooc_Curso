
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Name of the file:");
        String file = scanner.nextLine();
        
        try (Scanner scan = new Scanner(Paths.get(file))){
            
            String name;
            int age;
            while(scan.hasNextLine()){
                String line = scan.nextLine();
                String[] parts = line.split(",");
                name = parts[0];
                age = Integer.valueOf(parts[1]);
                
                if (age == 1){
                System.out.println(name + ", age: " + age + " year");
                } else {
                System.out.println(name + ", age: " + age + " years" );
                }    
            }
            
            
        } catch (Exception ex){
            System.out.println("Error: " + ex);
        }
    }
}
