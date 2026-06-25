package com.bridgelabz.commercialdata;

public class Main {

    public static void main(String[] args) {

        StockAccount account = new StockAccount();

        account.loadData();

        account.buy(100, "TCS");
        account.buy(50, "INFY");
        account.buy(75, "WIPRO");

        account.sell(20, "TCS");

        account.printReport();

        account.saveData();
    }
}