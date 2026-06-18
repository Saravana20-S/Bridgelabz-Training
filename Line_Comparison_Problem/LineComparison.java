package com.bridgelabz.Line_Comparison_Problem;

import java.util.Scanner;

public class LineComparison {
	public static double calculateLength(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) +
                         Math.pow(y2 - y1, 2));
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter x1 y1 x2 y2:");

        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();

        double length = calculateLength(x1, y1, x2, y2);

        System.out.println("Length of Line = " + length);

        sc.close();
    }

	
}


