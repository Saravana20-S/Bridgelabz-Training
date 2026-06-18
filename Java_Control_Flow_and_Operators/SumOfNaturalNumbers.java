package com.bridgelabz.Java_Control_Flow_and_Operators;

import java.util.Scanner;

public class SumOfNaturalNumbers {

    public static int findSum(int n) {

        int sum = 0;
        int i = 1;

        while (i <= n) {
            sum += i;
            i++;
        }

        return sum;
    }

    public static void printSeries(int n) {

        int i = 1;

        while (i <= n) {
            System.out.print(i);

            if (i < n) {
                System.out.print(" + ");
            }

            i++;
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
            System.out.println(" = " + findSum(n));

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Invalid Input");
        }

        sc.close();
    }
}
