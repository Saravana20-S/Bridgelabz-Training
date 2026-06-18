package com.bridgelabz.junit_testing;

import java.util.Scanner;

public class VendingMachine {
	
	 static int[] notes = {1000, 500, 100, 50, 10, 5, 2, 1};
	    static int count = 0;

	    public static void calculateNotes(int amount) {
	        if (amount == 0) {
	            return;
	        }

	        for (int note : notes) {
	            if (amount >= note) {
	                int num = amount / note;
	                count += num;

	                System.out.println(note + " x " + num);

	                calculateNotes(amount % note);
	                break;
	            }
	        }
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter amount: ");
	        int amount = sc.nextInt();

	        System.out.println("Notes Returned:");

	        calculateNotes(amount);

	        System.out.println("Minimum Notes Required: " + count);

	        sc.close();
	    }

}
