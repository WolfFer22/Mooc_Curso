/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lfofe
 */
public class Debt {
    private double debtValue;
    private double interestRate;    

    public Debt(double initialDebtValue, double initialInterestRate) {
        this.debtValue = initialDebtValue;
        this.interestRate = initialInterestRate;       
        
    }   
    public void waitOneYear(){
        this.debtValue = this.debtValue * this.interestRate;
    }
    
    public void printBalance(){        
        System.out.println(this.debtValue);        
    }
    
}
