package com.ironhack;

public class SavingsAccount extends Account{
    
    public SavingsAccount() {
        
    }

    public SavingsAccount(long accountNumber, String customerName, double balance) {
        super(accountNumber, customerName, balance);
    }

    void processPayment(double paymentAmount) {
        setBalance(getBalance() - paymentAmount);
    }

    void processDebit(double purchaseAmount) {
        setBalance(getBalance() + purchaseAmount);

    }
}
