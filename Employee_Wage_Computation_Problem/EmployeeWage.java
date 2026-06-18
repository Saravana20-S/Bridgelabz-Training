package com.bridgelabz.Employee_Wage_Computation_Problem;

public class EmployeeWage {

	static final int WAGE_PER_HOUR = 20;
	static final int PART_TIME_HOURS = 4;
	static final int FULL_TIME_HOURS = 8;
	static final int WORKING_DAYS = 20;

	public static void main(String[] args) {

		System.out.println("Welcome to Employee Wage Computation Program");

		int totalWage = 0;

		for (int day = 1; day <= WORKING_DAYS; day++) {

			int empCheck = (int) (Math.random() * 3);

			int workHours;

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

			totalWage += workHours * WAGE_PER_HOUR;
		}

		System.out.println("Monthly Wage = " + totalWage);
	}

}
