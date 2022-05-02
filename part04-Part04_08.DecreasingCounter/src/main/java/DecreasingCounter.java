
public class DecreasingCounter {

    private int value = 100;  // an object variable for storing the value of the counter

    public DecreasingCounter(int initialValue) {
        this.value = initialValue;
    }

    public void printValue() {
        if ( this.value >= 0 ) {
            System.out.println("value: " + this.value);
        } else {
            System.out.println("value: 0");
        }        
    }

    public void decrement() {        
        this.value--;        
    }
    
    public void reset(){
        this.value = 0;
    }
}
