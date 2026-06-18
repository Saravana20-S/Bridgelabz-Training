package com.bridgelabz.Java_Control_Flow_and_Operators;

import java.util.Scanner;

public class SumOfNaturalNumbersLoop {

    public static int calculateSum(int n) {

        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        return sum;
    }

    public static void printSeries(int n) {

        for (int i = 1; i <= n; i++) {

            System.out.print(i);

            if (i < n) {
                System.out.print(" + ");
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            System.out.print("Enter N: ");
            int n = sc.nextInt();

            if (n <= 0) {
                throw new IllegalArgumentException("N must be positive");
            }

            printSeries(n);
            System.out.println(" = " + calculateSum(n));

        } catch (Exception e) {
            System.out.println("Invalid Input");
        }

        sc.close();
    }
}
