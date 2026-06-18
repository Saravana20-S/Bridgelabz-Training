package com.bridgelabz.Java_Basic_Core_Programs;

import java.util.Scanner;

public class VowelConsonant {

    public static void checkAlphabet(char ch) {

        ch = Character.toLowerCase(ch);

        if (!Character.isLetter(ch)) {
            System.out.println("Invalid Alphabet");
            return;
        }

        if (ch == 'a' || ch == 'e' || ch == 'i'
                || ch == 'o' || ch == 'u') {

            System.out.println(ch + " is a Vowel");

        } else {

            System.out.println(ch + " is a Consonant");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            System.out.print("Enter Alphabet: ");
            char ch = sc.next().charAt(0);

            checkAlphabet(ch);

        } catch (Exception e) {
            System.out.println("Invalid Input");
        }

        sc.close();
    }
}
