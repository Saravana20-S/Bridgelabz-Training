package com.bridgelabz.junit_testing;

import java.util.Scanner;

public class Binary {
	
	 public static int swapNibbles(int number) {

	        return ((number & 0x0F) << 4)
	                | ((number & 0xF0) >> 4);
	    }

	    public static boolean isPowerOfTwo(int number) {

	        return number > 0 &&
	                (number & (number - 1)) == 0;
	    }

	    public static String toBinary(int number) {

	        return String.format("%8s",
	                Integer.toBinaryString(number))
	                .replace(' ', '0');
	    }

	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter a number (0-255): ");
	        int number = sc.nextInt();

	        System.out.println("Binary Representation : "
	                + toBinary(number));

	        int swapped = swapNibbles(number);

	        System.out.println("After Swapping Nibbles : "
	                + swapped);

	        System.out.println("Binary After Swap : "
	                + toBinary(swapped));

	        if (isPowerOfTwo(swapped)) {
	            System.out.println(swapped
	                    + " is a Power of 2");
	        } else {
	            System.out.println(swapped
	                    + " is not a Power of 2");
	        }

	        sc.close();
	    }

}
