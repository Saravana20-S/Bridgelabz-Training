package com.bridgelabz.commercialdata;

import java.time.LocalDateTime;

public class CompanyShares {

    private String stockSymbol;
    private int numberOfShares;
    private LocalDateTime transactionDate;

    public CompanyShares(String stockSymbol,
                         int numberOfShares) {

        this.stockSymbol = stockSymbol;
        this.numberOfShares = numberOfShares;
        this.transactionDate = LocalDateTime.now();
    }

    public String getStockSymbol() {
        return stockSymbol;
    }

    public int getNumberOfShares() {
        return numberOfShares;
    }

    public void buyShares(int shares) {
        numberOfShares += shares;
        transactionDate = LocalDateTime.now();
    }

    public void sellShares(int shares) {
        numberOfShares -= shares;
        transactionDate = LocalDateTime.now();
    }

    @Override
    public String toString() {
        return stockSymbol +
                " Shares=" + numberOfShares +
                " Date=" + transactionDate;
    }
}