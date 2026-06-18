package com.bridgelabz.Java_Control_Flow_and_Operators;

import java.util.Scanner;

public class DigitToWord {

    public static void printWord(int digit) {

        if (digit == 0) {
            System.out.println("Zero");
        } else if (digit == 1) {
            System.out.println("One");
        } else if (digit == 2) {
            System.out.println("Two");
        } else if (digit == 3) {
            System.out.println("Three");
        } else if (digit == 4) {
            System.out.println("Four");
        } else if (digit == 5) {
            System.out.println("Five");
        } else if (digit == 6) {
            System.out.println("Six");
        } else if (digit == 7) {
            System.out.println("Seven");
        } else if (digit == 8) {
            System.out.println("Eight");
        } else if (digit == 9) {
            System.out.println("Nine");
        } else {
            System.out.println("Please enter a single digit (0-9)");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter a digit: ");
            int digit = sc.nextInt();

            printWord(digit);

        } catch (Exception e) {
            System.out.println("Invalid Input");
        }

        sc.close();
    }
}
