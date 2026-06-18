package com.bridgelabz.junit_testing;

import java.util.Scanner;

public class TemperatureConversion {
	
	 public static double celsiusToFahrenheit(double celsius) {
	        return (celsius * 9 / 5) + 32;
	    }

	    public static double fahrenheitToCelsius(double fahrenheit) {
	        return (fahrenheit - 32) * 5 / 9;
	    }

	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        System.out.println("1. Celsius to Fahrenheit");
	        System.out.println("2. Fahrenheit to Celsius");

	        int choice = sc.nextInt();

	        switch (choice) {

	            case 1:
	                System.out.print("Enter Celsius: ");
	                double c = sc.nextDouble();
	                System.out.println("Fahrenheit = " +
	                        celsiusToFahrenheit(c));
	                break;

	            case 2:
	                System.out.print("Enter Fahrenheit: ");
	                double f = sc.nextDouble();
	                System.out.println("Celsius = " +
	                        fahrenheitToCelsius(f));
	                break;

	            default:
	                System.out.println("Invalid Choice");
	        }

	        sc.close();
	    }

}
