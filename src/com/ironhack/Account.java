package com.ironhack;

public abstract class Account {

    private long accountNumber;
    private String customerName;
    private double balance;

    public Account() {
        
    }

    public Account(long accountNumber, String customerName, double balance) {
        this.accountNumber = accountNumber;
        this.customerName = customerName;
        this.balance = balance;
    }


    abstract void processPayment(double paymentAmount);
    abstract void processDebit(double purchaseAmount);

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    
    public void setCustomerName(String name, String surname) {
        this.customerName = name + surname;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
