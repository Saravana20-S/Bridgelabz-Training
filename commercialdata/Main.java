package com.bridgelabz.commercialdata;

public class Main {

    public static void main(String[] args) {

        StockAccount account =
                new StockAccount();

        account.buy("TCS", 100);
        account.buy("INFY", 50);

        account.sell("TCS", 20);

        account.printReport();
    }
}