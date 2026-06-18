package com.bridgelabz.Java_Basic_Core_Programs;

public class PowerOfTwoCode {

    public static void printPowers(int n) {

        int power = 1;

        for (int i = 0; i <= n; i++) {

            System.out.println("2^" + i + " = " + power);

            power = power * 2;
        }
    }

    public static void main(String[] args) {

        try {

            if (args.length == 0) {
                throw new IllegalArgumentException(
                        "Please provide N as command-line argument");
            }

            int n = Integer.parseInt(args[0]);

            if (n < 0 || n >= 31) {
                throw new IllegalArgumentException(
                        "N must be between 0 and 30");
            }

            printPowers(n);

        } catch (IllegalArgumentException e) {

            System.out.println(e.getMessage());

        } catch (Exception e) {

            System.out.println("Invalid Input");
        }
    }
}
