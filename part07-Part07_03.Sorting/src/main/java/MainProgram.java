
import java.util.Arrays;

public class MainProgram {

    public static void main(String[] args) {

        int[] numbers = {6, 5, 8, 7, 11};

        System.out.println("Smallest: " + smallest(numbers));
        System.out.println("Index of smallest number: " + indexOfSmallest(numbers));
        System.out.println("Index of smallest from number 2 is " + indexOfSmallestFrom(numbers, 1));

        swap(numbers, 2, 4);
        System.out.println("Array with swapped numbers: " + Arrays.toString(numbers));

        sort(numbers);        
        
    }

    public static int smallest(int[] array) {
        if (array.length == 0) {
            return -1;
        }

        int smallest = array[0];
        
        for (int e : array) {
            
            if (e < smallest) {
                smallest = e;
            }

        }
        return smallest;
    }

    public static int indexOfSmallest(int[] array) {
        int smallest = array[0];
        int smallestIndex = 0;
        int index = 0;

        for (int it : array) {
            
            if (it < smallest) {
                smallest = it;
                smallestIndex = index;
            }
            
            index++;
        }

        return smallestIndex;
    }

    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        int smallest = table[startIndex];
        int index = startIndex;

        for (int i = startIndex; i < table.length; i++) {
            
            if (table[i] < smallest) {
                smallest = table[i]; 
                index = i;
            }
            
        }

        return index;
    }

    public static void swap(int[] array, int index1, int index2) {
        int swap = array[index1];
        array[index1] = array[index2];
        array[index2] = swap;
    }

    public static void sort(int[] array) {
        
        System.out.println(Arrays.toString(array));
        
        for (int i = 0; i < array.length; i++){
            
            swap(array, i, indexOfSmallestFrom(array, i));  
            
            System.out.println(Arrays.toString(array));
        }        

    }
    
}
