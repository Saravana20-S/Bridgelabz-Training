package com.bridgelabz.commercialdata;

import java.io.*;
import java.util.ArrayList;

public class StockAccount {

    private ArrayList<CompanyShares> companies;
    private final String FILE_NAME = "stocks.txt";

    public StockAccount() {
        companies = new ArrayList<>();
        loadData();
    }

    // Load data from file
    public void loadData() {

        File file = new File(FILE_NAME);

        if (!file.exists()) {
            return;
        }

        try (BufferedReader br =
                     new BufferedReader(new FileReader(file))) {

            String line;

            while ((line = br.readLine()) != null) {

                String[] data = line.split(",");

                String symbol = data[0];
                int shares = Integer.parseInt(data[1]);

                companies.add(
                        new CompanyShares(symbol, shares));
            }

        } catch (Exception e) {
            System.out.println("Error loading data");
        }
    }

    // Save data to file
    public void saveData() {

        try (BufferedWriter bw =
                     new BufferedWriter(
                             new FileWriter(FILE_NAME))) {

            for (CompanyShares company : companies) {

                bw.write(company.getStockSymbol()
                        + ","
                        + company.getNumberOfShares());

                bw.newLine();
            }

        } catch (Exception e) {
            System.out.println("Error saving data");
        }
    }

    // Buy shares
    public void buy(int amount, String symbol) {

        for (CompanyShares company : companies) {

            if (company.getStockSymbol()
                    .equalsIgnoreCase(symbol)) {

                company.buyShares(amount);
                saveData();
                return;
            }
        }

        companies.add(
                new CompanyShares(symbol, amount));

        saveData();
    }

    // Sell shares
    public void sell(int amount, String symbol) {

        for (CompanyShares company : companies) {

            if (company.getStockSymbol()
                    .equalsIgnoreCase(symbol)) {

                if (company.getNumberOfShares()
                        >= amount) {

                    company.sellShares(amount);

                    System.out.println(
                            amount + " shares sold.");
                } else {

                    System.out.println(
                            "Insufficient shares.");
                }

                saveData();
                return;
            }
        }

        System.out.println("Stock not found.");
    }

    // Print stock report
    public void printReport() {

        System.out.println("\n===== STOCK REPORT =====");

        for (CompanyShares company : companies) {
            System.out.println(company);
        }
    }
}