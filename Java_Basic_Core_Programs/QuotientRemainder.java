package com.bridgelabz.Java_Basic_Core_Programs;

import java.util.Scanner;

public class QuotientRemainder {

    public static void calculate(int dividend, int divisor) {

        int quotient = dividend / divisor;
        int remainder = dividend % divisor;

        System.out.println("Quotient = " + quotient);
        System.out.println("Remainder = " + remainder);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            System.out.print("Enter Dividend: ");
            int dividend = sc.nextInt();

            System.out.print("Enter Divisor: ");
            int divisor = sc.nextInt();

            if (divisor == 0) {
                throw new ArithmeticException("Division by zero is not allowed");
            }

            calculate(dividend, divisor);

        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Invalid Input");
        }

        sc.close();
    }
}