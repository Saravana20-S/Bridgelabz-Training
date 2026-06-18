package com.bridgelabz.junit_testing;

import java.util.Scanner;

public class MonthlyPayment {
	 public static double calculatePayment(double P, double Y, double R) {

	        double n = 12 * Y;

	        double r = R / (12 * 100);

	        return (P * r) /
	                (1 - Math.pow(1 + r, -n));
	    }

	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter Principal Amount: ");
	        double P = sc.nextDouble();

	        System.out.print("Enter Years: ");
	        double Y = sc.nextDouble();

	        System.out.print("Enter Interest Rate: ");
	        double R = sc.nextDouble();

	        double payment = calculatePayment(P, Y, R);

	        System.out.printf("Monthly Payment = %.2f%n", payment);

	        sc.close();
	    }

}
