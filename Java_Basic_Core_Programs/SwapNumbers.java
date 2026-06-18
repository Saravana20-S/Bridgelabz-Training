package com.bridgelabz.Java_Basic_Core_Programs;

import java.util.Scanner;

public class SwapNumbers {

    public static void swap(int a, int b) {

        System.out.println("Before Swap:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        int temp = a;
        a = b;
        b = temp;

        System.out.println("After Swap:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            System.out.print("Enter First Number: ");
            int a = sc.nextInt();

            System.out.print("Enter Second Number: ");
            int b = sc.nextInt();

            swap(a, b);

        } catch (Exception e) {
            System.out.println("Invalid Input");
        }

        sc.close();
    }
}
