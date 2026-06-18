package com.bridgelabz.Java_Basic_Core_Programs;

import java.util.Scanner;

public class LargestOfThree {

    public static void findLargest(int a, int b, int c) {

        int largest;

        if (a >= b && a >= c) {
            largest = a;
        } else if (b >= a && b >= c) {
            largest = b;
        } else {
            largest = c;
        }

        System.out.println("Largest Number = " + largest);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            System.out.print("Enter First Number: ");
            int a = sc.nextInt();

            System.out.print("Enter Second Number: ");
            int b = sc.nextInt();

            System.out.print("Enter Third Number: ");
            int c = sc.nextInt();

            findLargest(a, b, c);

        } catch (Exception e) {
            System.out.println("Invalid Input");
        }

        sc.close();
    }
}
