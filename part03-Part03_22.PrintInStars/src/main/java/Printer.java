
public class Printer {

    public static void main(String[] args) {
        // You can test the method here
        int[] array = {5, 1, 3, 4, 2};
        printArrayInStars(array);
    }

    public static void printArrayInStars(int[] array) {
        // Write some code in here        
        for (int i = 0; i < array.length; i++){
            int numberStars = array[i];            
            while (numberStars > 0){
                System.out.print("*");                
                numberStars--;                
            }
            System.out.println("");
        }

    }

}
