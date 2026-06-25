package com.bridgelabz.stockmanagement;

public class Stock {
    private String stockName;
    private int numberOfShares;
    private double sharePrice;

    public Stock(String stockName, int numberOfShares, double sharePrice) {
        this.stockName = stockName;
        this.numberOfShares = numberOfShares;
        this.sharePrice = sharePrice;
    }

    public double getStockValue() {
        return numberOfShares * sharePrice;
    }

    public void display() {
        System.out.println("Stock Name : " + stockName);
        System.out.println("Shares     : " + numberOfShares);
        System.out.println("Price      : " + sharePrice);
        System.out.println("Value      : " + getStockValue());
        System.out.println();
    }
}