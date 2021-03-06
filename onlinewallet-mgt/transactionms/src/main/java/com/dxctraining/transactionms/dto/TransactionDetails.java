package com.dxctraining.transactionms.dto;

import java.time.LocalDateTime;

public class TransactionDetails {
    private Long transactionId;

    private Long accountId;

    private double amount;

    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    private double newBalance;

    public double getNewBalance() {
        return newBalance;
    }

    public void setNewBalance(double newBalance) {
        this.newBalance = newBalance;
    }

    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Long getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(Long transactionId) {
        this.transactionId = transactionId;
    }

    private long transactionTimeMillis;

    public long getTransactionTimeMillis() {
        return transactionTimeMillis;
    }

    public void setTransactionTimeMillis(long transactionTimeMillis) {
        this.transactionTimeMillis = transactionTimeMillis;
    }

}
