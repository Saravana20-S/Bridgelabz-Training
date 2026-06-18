package com.bridgelabz.Java_Basic_Core_Programs;

import java.util.Scanner;

public class LeapYear {

    public static boolean isLeapYear(int year) {

        if (year % 400 == 0) {
            return true;
        }

        if (year % 100 == 0) {
            return false;
        }

        return year % 4 == 0;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            System.out.print("Enter a 4-Digit Year: ");
            int year = sc.nextInt();

            if (year < 1000 || year > 9999) {
                throw new IllegalArgumentException(
                        "Year must be a 4-digit number");
            }

            if (isLeapYear(year)) {
                System.out.println(year + " is a Leap Year");
            } else {
                System.out.println(year + " is Not a Leap Year");
            }

        } catch (IllegalArgumentException e) {

            System.out.println(e.getMessage());

        } catch (Exception e) {

            System.out.println("Invalid Input");
        }

        sc.close();
    }
}