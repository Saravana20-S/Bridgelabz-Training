package com.bridgelabz.Java_Basics_and_Fundamentals;

public class UserName {

    public static void displayName(String[] args) {

        if (args.length == 0) {
            throw new IllegalArgumentException("Name not provided");
        }

        System.out.println("Welcome, " + args[0]);
    }

    public static void main(String[] args) {

        try {
            displayName(args);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Unexpected Error");
        }
    }
}
