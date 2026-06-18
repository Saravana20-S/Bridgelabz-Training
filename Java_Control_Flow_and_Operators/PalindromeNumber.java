package com.bridgelabz.Java_Control_Flow_and_Operators;

import java.util.Scanner;

public class PalindromeNumber {

    public static int reverseNumber(int number) {

        int reverse = 0;

        for (int temp = number; temp != 0; temp /= 10) {

            int digit = temp % 10;

            reverse = reverse * 10 + digit;
        }

        return reverse;
    }

    public static boolean isPalindrome(int number) {

        return number == reverseNumber(number);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            System.out.print("Enter Number: ");
            int number = sc.nextInt();

            if (isPalindrome(number)) {
                System.out.println(number + " is a Palindrome Number");
            } else {
                System.out.println(number + " is Not a Palindrome Number");
            }

        } catch (Exception e) {
            System.out.println("Invalid Input");
        }

        sc.close();
    }
}