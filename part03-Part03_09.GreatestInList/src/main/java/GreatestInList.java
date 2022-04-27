
import java.util.ArrayList;
import java.util.Scanner;

public class GreatestInList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // leitura dos números intoduzidos
        // se introduzido o -1 o loop pára
        
        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }

            list.add(input);
        }
        
        System.out.println("");

        // implement finding the greatest number in the list here
        
        int greatestNumber = list.get(0); // atribuir número maior ao index 0 da lista
        
        for (int i = 0; i < list.size(); i++) {    // procurar número maior na lsita
            int number = list.get(i);
            if ( greatestNumber < number ) {
                greatestNumber = number;
            }            
        }
/*      int greatestNumber = list.get(0);
        int index = 0;
        while (index < list.size()) {
            if(greatestNumber < list.get(index)) {
               greatestNumber = list.get(index);
            }
            
            index++;
        }
*/        
        System.out.println("The greatest number: " + greatestNumber); // imprimir número maior
    }
}
