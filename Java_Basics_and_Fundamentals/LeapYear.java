package com.bridgelabz.Java_Basics_and_Fundamentals;

import java.util.Scanner;

public class LeapYear {

    public static boolean isLeapYear(int year) {

        if (year < 1582) {
            throw new IllegalArgumentException(
                    "Year should be greater than or equal to 1582");
        }

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
            System.out.print("Enter Year: ");
            int year = sc.nextInt();

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