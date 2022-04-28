
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
//            Scanner scanner = new Scanner(System.in);
//
//            ArrayList<String> names = new ArrayList<>();
//            ArrayList<Integer> birthYears = new ArrayList<>();
//            while (true) {
//                String input = scanner.nextLine();
//                if (input.equals("")) {
//                    break;
//                }
//
//                String[] parts = input.split(",");
//                names.add(parts[0]);
//                birthYears.add(Integer.valueOf(parts[1]));
//            }
//
//            String longest = names.get(0);
//            for (String name : names) {
//                if(name.length() > longest.length()) {
//                    longest = name;
//                }
//            }
//            System.out.println("Longest name: " + longest);
//
//            int sumOfBirthYears = 0;
//            for (int year : birthYears) {
//                sumOfBirthYears = sumOfBirthYears + year;
//            }
//            System.out.println("Average of the birth years: " + 1.0 * sumOfBirthYears / birthYears.size());