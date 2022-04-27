
import java.util.ArrayList;
import java.util.Scanner;

public class OnlyTheseNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();
        while (true) {            
            int number = Integer.valueOf(scanner.nextLine());
            if (number == -1) {
                break;
            }

            numbers.add(number);
        }
        System.out.println("From Where?");
        int indexStart = scanner.nextInt();
        
        System.out.println("To where?");
        int indexEnd = scanner.nextInt();
        
        while (indexStart <= indexEnd) {
            int number = numbers.get(indexStart);            
            System.out.println(number);
            indexStart = indexStart + 1;
        }    
       
    }
}
