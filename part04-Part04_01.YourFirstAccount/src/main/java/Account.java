/* 
 * DO NOT TOUCH THIS !
 */

public class Account {

    private double balance;
    private String owner;

    public Account(String owner1, double balance1) {
        this.balance = balance1;
        this.owner = owner1;
    }

    public void deposit(double amount) {
        this.balance = this.balance + amount;
    }

    public void withdrawal(double amount) {
        this.balance = this.balance - amount;
    }

//    public double saldo() {
//        return this.balance;
//    }

    @Override
    public String toString() {
        return this.owner + " balance: " + this.balance;
    }
}
