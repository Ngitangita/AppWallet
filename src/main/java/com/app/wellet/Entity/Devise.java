package com.app.wellet.Entity;

import java.util.Objects;

public class Devise {
    private Integer id;
    private Float rateChange;
    private String deviseSymbol;
    private Account account;

    public Devise(Integer id, Float rateChange, String deviseSymbol, Account account){
        this.id = id;
        this.rateChange = rateChange;
        this.deviseSymbol = deviseSymbol;
        this.account = account;
    }

    public Integer getId(){
        return id;
    }

    public void setId(Integer id){
        this.id = id;
    }

    public Float getRateChange(){
        return rateChange;
    }

    public void setRateChange(Float rateChange){
        this.rateChange = rateChange;
    }

    public String getDeviseSymbol(){
        return deviseSymbol;
    }

    public void setDeviseSymbol(String deviseSymbol){
        this.deviseSymbol = deviseSymbol;
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
        Devise devise = (Devise) o;
        return Objects.equals ( id, devise.id ) && Objects.equals ( rateChange, devise.rateChange ) && Objects.equals ( deviseSymbol, devise.deviseSymbol ) && Objects.equals ( account, devise.account );
    }

    @Override
    public int hashCode(){
        return Objects.hash ( id, rateChange, deviseSymbol, account );
    }

    @Override
    public String toString(){
        return "Devise{" +
                "id=" + id +
                ", rateChange=" + rateChange +
                ", deviseSymbol='" + deviseSymbol + '\'' +
                ", account=" + account +
                '}';
    }
}

