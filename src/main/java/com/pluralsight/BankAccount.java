package com.pluralsight;

import java.math.BigDecimal;

public class BankAccount implements Valuable {
    private BigDecimal balance;
    private String name;

    public BankAccount(int something, String name, BigDecimal balance) {
        this.name = name;
        this.balance = balance;
    }

    public void withdraw(double amount) {
        this.balance -= amount;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public double getValue(){
        return this.balance;
    }
}
