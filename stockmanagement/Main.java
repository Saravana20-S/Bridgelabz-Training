package com.bridgelabz.stockmanagement;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        StockPortfolio portfolio = new StockPortfolio();

        System.out.print("Enter Number of Stocks: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            System.out.println("\nStock " + i);

            System.out.print("Enter Stock Name: ");
            String name = sc.next();

            System.out.print("Enter Number Of Shares: ");
            int shares = sc.nextInt();

            System.out.print("Enter Share Price: ");
            double price = sc.nextDouble();

            portfolio.addStock(new Stock(name, shares, price));
        }

        portfolio.displayReport();
    }
}