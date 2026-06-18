package com.bridgelabz.Java_Control_Flow_and_Operators;

import java.util.Scanner;

public class ReverseNumber {

    public static int reverse(int number) {

        int reverse = 0;

        while (number != 0) {

            int digit = number % 10;

            reverse = reverse * 10 + digit;

            number = number / 10;
        }

        return reverse;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            System.out.print("Enter Number: ");
            int number = sc.nextInt();

            System.out.println("Reversed Number = " + reverse(number));

        } catch (Exception e) {
            System.out.println("Invalid Input");
        }

        sc.close();
    }
}
