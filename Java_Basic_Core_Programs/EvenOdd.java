package com.bridgelabz.Java_Basic_Core_Programs;

import java.util.Scanner;

public class EvenOdd {

    public static void checkEvenOdd(int number) {

        if (number % 2 == 0) {
            System.out.println(number + " is Even");
        } else {
            System.out.println(number + " is Odd");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            System.out.print("Enter Number: ");
            int number = sc.nextInt();

            checkEvenOdd(number);

        } catch (Exception e) {
            System.out.println("Invalid Input");
        }

        sc.close();
    }
}
