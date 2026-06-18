package com.bridgelabz.Java_Basic_Core_Programs;

import java.util.Scanner;

public class HarmonicNumber {

    public static double calculateHarmonic(int n) {

        double harmonic = 0.0;

        for (int i = 1; i <= n; i++) {
            harmonic += 1.0 / i;
        }

        return harmonic;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            System.out.print("Enter N: ");
            int n = sc.nextInt();

            if (n == 0) {
                throw new IllegalArgumentException(
                        "N should not be zero");
            }

            double result = calculateHarmonic(n);

            System.out.println(
                    "Nth Harmonic Value = " + result);

        } catch (IllegalArgumentException e) {

            System.out.println(e.getMessage());

        } catch (Exception e) {

            System.out.println("Invalid Input");
        }

        sc.close();
    }
}
