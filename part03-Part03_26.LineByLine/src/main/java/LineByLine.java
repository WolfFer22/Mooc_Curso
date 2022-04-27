
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);       

        while(true){
            String input = scanner.nextLine();
            String[] inputSplit = input.split(" ");
            if (input.equals("")){
                break;
            } else {
                stringName(inputSplit);
            }
        }            

    }
    
    public static void stringName(String[] texto){  
        
        for (int i = 0; i < texto.length; i++){            
            System.out.println(texto[i]);            
        }                   
    }
}
