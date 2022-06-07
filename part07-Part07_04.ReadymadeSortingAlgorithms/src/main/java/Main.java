
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        // insert test code here
        int[] array = {3, 1, 5, 99, 3, 12};
        System.out.println(Arrays.toString(array));

//        sort(array);
//        System.out.println(Arrays.toString(array));

//        String[] arrayStrings = {"luis", "marta", "jose", "teresa"};        
//        System.out.println(Arrays.toString(arrayStrings));
//        Arrays.sort(arrayStrings);
//        System.out.println(Arrays.toString(arrayStrings));

//        ArrayList<Integer> numbers = new ArrayList<>();
//        for (int i = 0; i < array.length; i++) {
//            numbers.add(array[i]);
//        }
//        System.out.println(numbers);
//        Collections.sort(numbers);
//        System.out.println(numbers);

//        ArrayList<String> list = new ArrayList<>();
//        list.add("luis");
//        list.add("marta");
//        list.add("jose");
//        list.add("teresa");
//        System.out.println(list);
//        Collections.sort(list);
//        System.out.println(list);
        

        

    }

    public static void sort(int[] array) {
        Arrays.sort(array);
    }

    public static void sort(String[] array) {
        Arrays.sort(array);
    }

    public static void sortIntegers(ArrayList<Integer> integers) {

        Collections.sort(integers);
    }

    public static void sortStrings(ArrayList<String> strings) {
        Collections.sort(strings);
    }
}
