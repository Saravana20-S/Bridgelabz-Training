package com.bridgelabz.commercialdata;

import java.util.ArrayList;

public class StockAccount {

    private ArrayList<CompanyShares> companies =
            new ArrayList<>();

    public void buy(String symbol, int shares) {

        for (CompanyShares company : companies) {

            if (company.getStockSymbol()
                    .equals(symbol)) {

                company.buyShares(shares);
                return;
            }
        }

        companies.add(new CompanyShares(symbol,
                shares));
    }

    public void sell(String symbol, int shares) {

        for (CompanyShares company : companies) {

            if (company.getStockSymbol()
                    .equals(symbol)) {

                if (company.getNumberOfShares()
                        >= shares) {

                    company.sellShares(shares);
                }

                return;
            }
        }
    }

    public void printReport() {

        System.out.println("\nStock Report");

        for (CompanyShares company : companies) {
            System.out.println(company);
        }
    }
}