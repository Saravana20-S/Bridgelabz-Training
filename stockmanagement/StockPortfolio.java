package com.bridgelabz.stockmanagement;

import java.util.ArrayList;

public class StockPortfolio {

    private ArrayList<Stock> stocks = new ArrayList<>();

    public void addStock(Stock stock) {
        stocks.add(stock);
    }

    public double getTotalValue() {
        double total = 0;

        for (Stock stock : stocks) {
            total += stock.getStockValue();
        }

        return total;
    }

    public void displayReport() {
        System.out.println("----- STOCK REPORT -----");

        for (Stock stock : stocks) {
            stock.display();
        }

        System.out.println("Total Stock Value = " + getTotalValue());
    }
}