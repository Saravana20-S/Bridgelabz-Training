package com.bridgelabz.junit_testing;

import java.util.Scanner;

public class SqrtNewton {
	
	 public static double sqrt(double c) {

	        if (c < 0) {
	            throw new IllegalArgumentException("Number must be non-negative");
	        }

	        double epsilon = 1e-15;
	        double t = c;

	        while (Math.abs(t - c / t) > epsilon * t) {
	            t = (c / t + t) / 2.0;
	        }

	        return t;
	    }

	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter a non-negative number: ");
	        double c = sc.nextDouble();

	        System.out.println("Square Root = " + sqrt(c));

	        sc.close();
	    }

}
