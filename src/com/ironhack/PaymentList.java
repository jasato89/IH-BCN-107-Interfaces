package com.ironhack;

import java.util.ArrayList;
import java.util.Date;

public class PaymentList  implements TransactionList{

    private String paymentListName;
    private int size;
    private ArrayList<Transaction> transactions;

    public PaymentList() {
    }

    public PaymentList(String paymentListName, int size, ArrayList<Transaction> transactions) {
        this.paymentListName = paymentListName;
        this.size = size;
        this.transactions = transactions;
    }

    public Transaction getLastTransaction() {
        return transactions.get(transactions.size() -1);
    }

    public void addTransaction(Transaction transaction) {
        transactions.add(transaction);

    }

    public Transaction getTransactionByDate(Date date) {
        return null;
    }

    public ArrayList<Transaction> getAllTransactions() {
        return transactions;
    }
}
