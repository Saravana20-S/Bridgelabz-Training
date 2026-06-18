package com.bridgelabz.Java_Control_Flow_and_Operators;

import java.util.Scanner;

public class VowelOrConsonant {

    public static void checkCharacter(char ch) {

        ch = Character.toLowerCase(ch);

        switch (ch) {

            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println(ch + " is a Vowel");
                break;

            default:

                if (Character.isLetter(ch)) {
                    System.out.println(ch + " is a Consonant");
                } else {
                    System.out.println("Invalid Character");
                }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            System.out.print("Enter a Character: ");
            char ch = sc.next().charAt(0);

            checkCharacter(ch);

        } catch (Exception e) {
            System.out.println("Invalid Input");
        }

        sc.close();
    }
}