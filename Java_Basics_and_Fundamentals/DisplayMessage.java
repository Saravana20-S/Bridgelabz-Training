package com.bridgelabz.Java_Basics_and_Fundamentals;

public class DisplayMessage {

    public static void display() {
        System.out.println("Welcome to Java Programming!");
    }

    public static void main(String[] args) {
        try {
            display();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
