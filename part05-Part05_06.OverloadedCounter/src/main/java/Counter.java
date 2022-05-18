
public class Counter {
    
    private int value;

    public Counter(int value) {
        this.value = value;
    }
    
    public Counter(){
        this(0);
    }
    
    public int value(){
        return this.value;
    }
    
    public void increase(){
        this.value++;
    }
    
    public void increase(int increaseBy){
        if (increaseBy < 0){
            value();
        } else {
            this.value = this.value + increaseBy;
        }
        
    }
    
    public void decrease(){
        this.value--;
    }
    
    public void decrease(int decreaseBy){
        if (decreaseBy < 0){
            value();
        } else {
            this.value = this.value - decreaseBy;
        }
        
    }
    
    public int getValue(){
        return this.value;
    }
}
