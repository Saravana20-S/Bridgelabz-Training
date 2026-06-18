package com.bridgelabz.Java_Basics_and_Fundamentals;

import java.util.Scanner;

public class StringComparison {

    public static boolean checkEqual(String str1, String str2) {
        return str1.equals(str2);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter First String: ");
            String str1 = sc.nextLine();

            System.out.print("Enter Second String: ");
            String str2 = sc.nextLine();

            if (checkEqual(str1, str2)) {
                System.out.println("Strings are Equal");
            } else {
                System.out.println("Strings are Not Equal");
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}