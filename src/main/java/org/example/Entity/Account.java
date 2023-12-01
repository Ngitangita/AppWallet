package org.example.Entity;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;

public class Account {
    private Integer id;
    private Float sold;
    private String accountType;
    private LocalDateTime openDate;
    private Long accountNumber;
    private Devise devise;
    private List<Transaction> transactions;

    public Integer getId(){
        return id;
    }

    public void setId(Integer id){
        this.id = id;
    }

    public Float getSold(){
        return sold;
    }

    public void setSold(Float sold){
        this.sold = sold;
    }

    public String getAccountType(){
        return accountType;
    }

    public void setAccountType(String accountType){
        this.accountType = accountType;
    }

    public LocalDateTime getOpenDate(){
        return openDate;
    }

    public void setOpenDate(LocalDateTime openDate){
        this.openDate = openDate;
    }

    public Long getAccountNumber(){
        return accountNumber;
    }

    public void setAccountNumber(Long accountNumber){
        this.accountNumber = accountNumber;
    }

    public Devise getDevise(){
        return devise;
    }

    public void setDevise(Devise devise){
        this.devise = devise;
    }

    public List<Transaction> getTransactions(){
        return transactions;
    }

    public void setTransactions(List<Transaction> transactions){
        this.transactions = transactions;
    }

    public Account(Integer id, Float sold, String accountType, LocalDateTime openDate, Long accountNumber, Devise devise, List<Transaction> transactions){
        this.id = id;
        this.sold = sold;
        this.accountType = accountType;
        this.openDate = openDate;
        this.accountNumber = accountNumber;
        this.devise = devise;
        this.transactions = transactions;
    }

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass ( ) != o.getClass ( )) return false;
        Account account = (Account) o;
        return Objects.equals ( id, account.id ) && Objects.equals ( sold, account.sold ) && Objects.equals ( accountType, account.accountType ) && Objects.equals ( openDate, account.openDate ) && Objects.equals ( accountNumber, account.accountNumber ) && Objects.equals ( devise, account.devise ) && Objects.equals ( transactions, account.transactions );
    }

    @Override
    public int hashCode(){
        return Objects.hash ( id, sold, accountType, openDate, accountNumber, devise, transactions );
    }

    @Override
    public String toString(){
        return "Account{" +
                "id=" + id +
                ", sold=" + sold +
                ", accountType='" + accountType + '\'' +
                ", openDate=" + openDate +
                ", accountNumber=" + accountNumber +
                ", devise=" + devise +
                ", transactions=" + transactions +
                '}';
    }
}
