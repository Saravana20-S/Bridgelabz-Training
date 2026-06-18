package com.bridgelabz.Java_Basic_Core_Programs;

import java.util.Scanner;

public class FlipCoin {

    public static void flipCoin(int numberOfFlips) {

        int headsCount = 0;
        int tailsCount = 0;

        for (int i = 1; i <= numberOfFlips; i++) {

            double randomValue = Math.random();

            if (randomValue < 0.5) {
                tailsCount++;
            } else {
                headsCount++;
            }
        }

        double headPercentage =
                (headsCount * 100.0) / numberOfFlips;

        double tailPercentage =
                (tailsCount * 100.0) / numberOfFlips;

        System.out.println("Total Flips : " + numberOfFlips);
        System.out.println("Heads Count : " + headsCount);
        System.out.println("Tails Count : " + tailsCount);

        System.out.printf("Heads Percentage : %.2f%%\n",
                headPercentage);

        System.out.printf("Tails Percentage : %.2f%%\n",
                tailPercentage);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            System.out.print("Enter Number of Flips: ");
            int numberOfFlips = sc.nextInt();

            if (numberOfFlips <= 0) {
                throw new IllegalArgumentException(
                        "Number of flips must be positive");
            }

            flipCoin(numberOfFlips);

        } catch (IllegalArgumentException e) {

            System.out.println(e.getMessage());

        } catch (Exception e) {

            System.out.println("Invalid Input");
        }

        sc.close();
    }
}