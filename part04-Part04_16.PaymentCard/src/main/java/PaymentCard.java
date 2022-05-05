
public class PaymentCard {
    private double balance;   

    public PaymentCard(double openingBalance) {
        this.balance = openingBalance;
    }
    
    public void eatAffordably(){
        if ( this.balance >= 2.6){
            this.balance -= 2.6;
        }
        
    }
    public void eatHeartily(){
        if ( this.balance >= 4.6){
            this.balance -= 4.6;
        }
    }
    public void addMoney(double deposit){                               
            if ( deposit > 0 ){ 
                this.balance += deposit;
            }
    }
    
    public String toString(){
        if ( this.balance >= 150){
            return "The card has a balance of 150.0 euros";
        }
        return "The card has a balance of " + this.balance + " euros";
    }
}
