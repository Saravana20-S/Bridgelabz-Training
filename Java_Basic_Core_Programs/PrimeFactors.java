package com.bridgelabz.Java_Basic_Core_Programs;

import java.util.Scanner;

public class PrimeFactors {

    public static void findPrimeFactors(int number) {

        System.out.print("Prime Factors: ");

        for (int i = 2; i * i <= number; i++) {

            while (number % i == 0) {

                System.out.print(i + " ");

                number = number / i;
            }
        }

        if (number > 1) {
            System.out.print(number);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            System.out.print("Enter Number: ");
            int number = sc.nextInt();

            if (number <= 1) {
                throw new IllegalArgumentException(
                        "Number must be greater than 1");
            }

            findPrimeFactors(number);

        } catch (IllegalArgumentException e) {

            System.out.println(e.getMessage());

        } catch (Exception e) {

            System.out.println("Invalid Input");
        }

        sc.close();
    }
}
