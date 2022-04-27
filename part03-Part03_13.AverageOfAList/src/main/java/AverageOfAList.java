
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program, that first reads user input
        // adding them on a list until user gives -1.
        // Then it computes the average of the numbers on the list
        // and prints it.
        ArrayList <Integer> listInputNumbers = new ArrayList <>();
        while (true) {
            int input = scanner.nextInt();
            if (input == -1 ) {
                break;
            }
            listInputNumbers.add(input);
        }
        int sumOfNumbers = 0;
        double averageOfNumbersInput = 0;
        /*
        int index = 0;
        while (index < listInputNumbers.size()) {
            sumOfNumbers = sumOfNumbers + listInputNumbers.get(index);
            index++;
        }
        */
        for (Integer number : listInputNumbers) {
            sumOfNumbers = sumOfNumbers + number;
        }       
        
        averageOfNumbersInput = (double) sumOfNumbers / listInputNumbers.size();
        
        System.out.println("Average: " + averageOfNumbersInput);
    }
}
