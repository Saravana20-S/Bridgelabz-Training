package com.bridgelabz.junit_testing;

import java.util.Scanner;

public class ToBinary {
	
	public static String toBinary(int number) {

        String binary = Integer.toBinaryString(number);

        return String.format("%32s", binary).replace(' ', '0');
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a decimal number: ");
        int number = sc.nextInt();

        String binary = toBinary(number);

        System.out.println("32-bit Binary Representation:");
        System.out.println(binary);

        sc.close();
    }

}
