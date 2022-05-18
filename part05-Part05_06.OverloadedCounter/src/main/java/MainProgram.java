
public class MainProgram {

    public static void main(String[] args) {
        // Test your counter here
        Counter count = new Counter();
        count.increase();
        System.out.println(count.getValue());
        
        count.increase(2);
        System.out.println(count.getValue());
        
        count.decrease();
        System.out.println(count.getValue());
        
        count.decrease(8);
        System.out.println(count.getValue());
        
        count.decrease(-8);
        System.out.println(count.getValue());
        
        count.increase(-2);
        System.out.println(count.getValue());
        
    }
}
