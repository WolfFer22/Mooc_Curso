
import java.util.ArrayList;
import java.util.Scanner;

public class SumOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }

            list.add(input);
        }

        System.out.println("");
        
        int sumOfNumbers = 0;
        for (Integer numbersInput : list) {
            sumOfNumbers = sumOfNumbers + numbersInput;            
        }

        System.out.println("Sum: " + sumOfNumbers);
    }
}
