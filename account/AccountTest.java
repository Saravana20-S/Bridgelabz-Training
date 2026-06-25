package com.bridgelabz.account;

import java.util.Scanner;

public class AccountTest {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Account account =
                new Account("Saravanan", 1000);

        System.out.println("Initial Balance : "
                + account.getBalance());

        System.out.print("Enter Debit Amount : ");
        double amount = sc.nextDouble();

        account.debit(amount);

        System.out.println("Remaining Balance : "
                + account.getBalance());
    }
}