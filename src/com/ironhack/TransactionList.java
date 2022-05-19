package com.ironhack;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public interface TransactionList {

    Transaction getLastTransaction();
    void addTransaction(Transaction transaction);
    Transaction getTransactionByDate(Date date);
    ArrayList<Transaction> getAllTransactions();
}
