package com.bridgelabz.Employee_Wage_Computation_Problem;

public class EmployeeWage {

	static final int WAGE_PER_HOUR = 20;
	static final int PART_TIME_HOURS = 4;
	static final int FULL_TIME_HOURS = 8;

	public static void main(String[] args) {

		System.out.println("Welcome to Employee Wage Computation Program");

		int empCheck = (int) (Math.random() * 3);

		int workHours = 0;

		switch (empCheck) {

		case 1:
			workHours = PART_TIME_HOURS;
			break;

		case 2:
			workHours = FULL_TIME_HOURS;
			break;

		default:
			workHours = 0;
		}

		int dailyWage = workHours * WAGE_PER_HOUR;

		System.out.println("Work Hours = " + workHours);
		System.out.println("Daily Wage = " + dailyWage);
	}

}
