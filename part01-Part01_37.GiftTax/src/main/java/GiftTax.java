
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Value of the gift?");
        int giftFamilyOrRelative = scan.nextInt();
        
        if (giftFamilyOrRelative >= 5000 && giftFamilyOrRelative < 25000) {
            double tax =  100 + ((giftFamilyOrRelative-5000)*0.08);
            System.out.println("Tax: " + tax);                                      
        } else if (giftFamilyOrRelative >= 25000 && giftFamilyOrRelative < 55000) {
            double tax =  1700  + ((giftFamilyOrRelative-25000)*0.10);
            System.out.println("Tax: " + tax);
        }else if (giftFamilyOrRelative >= 55000 && giftFamilyOrRelative < 200000) {
            double tax = 4700 + ((giftFamilyOrRelative-55000)*0.12);
            System.out.println("Tax: " + tax);
        }else if (giftFamilyOrRelative >= 200000 && giftFamilyOrRelative < 1000000) {
            double tax = 22100  + ((giftFamilyOrRelative-200000)*0.15);
            System.out.println("Tax: " + tax);
        }else if (giftFamilyOrRelative >= 1000000) {
            double tax = 142100 + ((giftFamilyOrRelative-1000000)*0.17);
            System.out.println("Tax: " + tax);
        }else {
            System.out.println("No tax!");
        }
            
    }
}
