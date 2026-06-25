package com.bridgelabz.account;

public class Account {

    private String name;
    private double balance;

    public Account(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public void credit(double amount) {
        balance += amount;
    }

    public void debit(double amount) {

        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println(
                    "Debit amount exceeded account balance.");
        }
    }

    public double getBalance() {
        return balance;
    }

    public String getName() {
        return name;
    }
}