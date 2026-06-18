package com.bridgelabz.Line_Comparison_Problem;

import java.util.Scanner;

public class LineComparison {
	public static Double calculateLength(int x1, int y1, int x2, int y2) {
		return Math.sqrt(Math.pow(x2 - x1, 2) +
				Math.pow(y2 - y1, 2));
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter First Line Coordinates:");
		int x1 = sc.nextInt();
		int y1 = sc.nextInt();
		int x2 = sc.nextInt();
		int y2 = sc.nextInt();

		System.out.println("Enter Second Line Coordinates:");
		int x3 = sc.nextInt();
		int y3 = sc.nextInt();
		int x4 = sc.nextInt();
		int y4 = sc.nextInt();

		Double length1 = calculateLength(x1, y1, x2, y2);
		Double length2 = calculateLength(x3, y3, x4, y4);

		if (length1.equals(length2)) {
			System.out.println("Both Lines are Equal");
		} else {
			System.out.println("Both Lines are Not Equal");
		}

		sc.close();
	}


}


