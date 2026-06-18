package com.bridgelabz.Employee_Wage_Computation_Problem;

public class EmployeeWage {

	static final int WAGE_PER_HOUR = 20;
	static final int PART_TIME_HOURS = 4;
	static final int FULL_TIME_HOURS = 8;

	public static void main(String[] args) {

		System.out.println("Welcome to Employee Wage Computation Program");

		int empCheck = (int) (Math.random() * 3);

		if (empCheck == 1) {

			int wage = PART_TIME_HOURS * WAGE_PER_HOUR;

			System.out.println("Part Time Employee");
			System.out.println("Daily Wage = " + wage);

		} else if (empCheck == 2) {

			int wage = FULL_TIME_HOURS * WAGE_PER_HOUR;

			System.out.println("Full Time Employee");
			System.out.println("Daily Wage = " + wage);

		} else {

			System.out.println("Employee Absent");
			System.out.println("Daily Wage = 0");
		}
	}

}
