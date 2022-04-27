
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == 9999) {
                break;
            }

            list.add(input);
        }        
        
        int i = 0;
        int smallestNumber = list.get(0);
        while ( i < list.size()) {            
            if (smallestNumber > list.get(i)){
                smallestNumber = list.get(i);
            }            
            i++;
        }
        System.out.println("Smallest number: " + smallestNumber);        
        
        for (int index = 0; index < list.size(); index++) {            
            if ( smallestNumber == list.get(index)) {                
                System.out.println("Found at index " + index);
            }
        }
    }
}
