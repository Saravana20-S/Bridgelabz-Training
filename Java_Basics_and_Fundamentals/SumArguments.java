package com.bridgelabz.Java_Basics_and_Fundamentals;

public class SumArguments {

    public static void calculate(String[] args) {

        int sum = 0;
        int invalidCount = 0;

        for (String arg : args) {
            try {
                sum += Integer.parseInt(arg);
            } catch (NumberFormatException e) {
                invalidCount++;
            }
        }

        System.out.println("Sum = " + sum);
        System.out.println("Invalid Integers = " + invalidCount);
    }

    public static void main(String[] args) {
        try {
            calculate(args);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
