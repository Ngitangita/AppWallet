package com.app.wellet.entity;

import java.time.LocalDateTime;
import java.util.Objects;

public class Transaction {
    private Integer id;
    private Float amount;
    private String type;
    private LocalDateTime  transactionDate;
    private Account account;

    public Transaction(Integer id, Float amount, String type, LocalDateTime transactionDate, Account account){
        this.id = id;
        this.amount = amount;
        this.type = type;
        this.transactionDate = transactionDate;
        this.account = account;
    }

    public Integer getId(){
        return id;
    }

    public void setId(Integer id){
        this.id = id;
    }

    public Float getAmount(){
        return amount;
    }

    public void setAmount(Float amount){
        this.amount = amount;
    }

    public String getType(){
        return type;
    }

    public void setType(String type){
        this.type = type;
    }

    public LocalDateTime getTransactionDate(){
        return transactionDate;
    }

    public void setTransactionDate(LocalDateTime transactionDate){
        this.transactionDate = transactionDate;
    }

    public Account getAccount(){
        return account;
    }

    public void setAccount(Account account){
        this.account = account;
    }

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass ( ) != o.getClass ( )) return false;
        Transaction that = (Transaction) o;
        return Objects.equals ( id, that.id ) && Objects.equals ( amount, that.amount ) && Objects.equals ( type, that.type ) && Objects.equals ( transactionDate, that.transactionDate ) && Objects.equals ( account, that.account );
    }

    @Override
    public int hashCode(){
        return Objects.hash ( id, amount, type, transactionDate, account );
    }

    @Override
    public String toString(){
        return "Transaction{" +
                "id=" + id +
                ", amount=" + amount +
                ", type='" + type + '\'' +
                ", transactionDate=" + transactionDate +
                ", account=" + account +
                '}';
    }
}
