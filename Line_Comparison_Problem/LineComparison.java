package com.bridgelabz.Line_Comparison_Problem;

public class LineComparison {

	static String s;

	public static void printValue(Object obj) {
		System.out.println("Object version called");
	}

	public static void printValue(String str) {
		System.out.println("String version called");
	}
	
	
	public static void main(String[] args) {
		System.out.println(s);
//			printValue(null);
	}

}


