package com.ironhack;

import java.util.Date;

public class Transaction {
    private int sellerAccountNumber;
    private int buyerAccountNUmber;
    private double amount;
    private Date date;

    public Transaction(int sellerAccountNumber, int buyerAccountNUmber, double amount, Date date) {
        this.sellerAccountNumber = sellerAccountNumber;
        this.buyerAccountNUmber = buyerAccountNUmber;
        this.amount = amount;
        this.date = date;
    }

    public int getSellerAccountNumber() {
        return sellerAccountNumber;
    }

    public void setSellerAccountNumber(int sellerAccountNumber) {
        this.sellerAccountNumber = sellerAccountNumber;
    }

    public int getBuyerAccountNUmber() {
        return buyerAccountNUmber;
    }

    public void setBuyerAccountNUmber(int buyerAccountNUmber) {
        this.buyerAccountNUmber = buyerAccountNUmber;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
