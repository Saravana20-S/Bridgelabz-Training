package com.bridgelabz.Java_Control_Flow_and_Operators;

import java.util.Scanner;

public class ReverseNumberLoop {

    public static int reverseNumber(int number) {

        int reverse = 0;

        for (; number != 0; number /= 10) {

            int digit = number % 10;

            reverse = reverse * 10 + digit;
        }

        return reverse;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            System.out.print("Enter Number: ");
            int number = sc.nextInt();

            System.out.println("Reversed Number = " + reverseNumber(number));

        } catch (Exception e) {
            System.out.println("Invalid Input");
        }

        sc.close();
    }
}