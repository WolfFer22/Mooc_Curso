
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sumYears = 0;
        int countYears = 0;
        String longestName = "";        
        int bigerName = 0;
        
        while (true){
            String input = scanner.nextLine();
            
            if (input.equals("")){
            break;
            }
            
            String [] inputParts = input.split(",");
            
            int year = Integer.valueOf(inputParts[1]);            
            
            int sizeName = inputParts[0].length();
                                    
            if ( sizeName > bigerName ){
                bigerName = sizeName;
                longestName = inputParts[0];
            }                  
            sumYears += year;
            countYears++;
                       
        }
        System.out.println("Longest name: " + longestName);
        System.out.println("Average of the birth years: " + 1.0 * sumYears/countYears);
        
    }
}
