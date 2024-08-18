/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author marina.rekish
 */
public class PaymentCard {
    
    private double balance;
    
    public PaymentCard(double openingBalance) {
        this.balance = openingBalance;
    }
    
    public void eatAffordably() {
        double result = this.balance - 2.60;
        
        if (result < 0) {
            result = this.balance;
        } else {
            this.balance -= 2.60;
        }
    }

    public void eatHeartily() {
        double result = this.balance - 4.60;
        
        if (result < 0) {
            result = this.balance;
        } else {
            this.balance -= 4.60;
        }
    }
    
    public void addMoney(double amount) {
//        double topBalance = 150.0;
//        double minBalance = 10.0;
//        
//        double finalBalance = this.balance += amount;
//        
//        if (finalBalance < minBalance) {
//            finalBalance = minBalance;
//        } 
//        
//        if (finalBalance > topBalance) {
//            finalBalance = topBalance;
//        }
//        
//        this.balance = finalBalance;
        if (amount < 0) {
            return; // Ignore negative amounts
        }

        double topBalance = 150.0;
        this.balance += amount;
        
        if (this.balance > topBalance) {
            this.balance = topBalance;
        }
    }
    
    public String toString() {
        return String.format("The card has a balance of " + this.balance + " euros");
    }
}
