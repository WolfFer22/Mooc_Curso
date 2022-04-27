

public class FromParameterToOne {

    public static void main(String[] args) {
        
        printFromNumberToOne(5);

    }
    
    public static void printFromNumberToOne(int number) {
        
        int i = number;
        while ( i > 0 ) {
            System.out.println(i);
            i--;         
        }
        
//      for ( int i = number; i > 0 ; i--) {
//          System.out.println(i);
//      }
        
    }

}
