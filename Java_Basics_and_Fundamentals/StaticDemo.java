package com.bridgelabz.Java_Basics_and_Fundamentals;

public class StaticDemo {

    static int count;

    static {
        count = 100;
        System.out.println("Static Block Executed");
    }

    public static void display() {
        System.out.println("Static Method Called");
        System.out.println("Count = " + count);
    }

    public static void main(String[] args) {

        try {
            display();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
