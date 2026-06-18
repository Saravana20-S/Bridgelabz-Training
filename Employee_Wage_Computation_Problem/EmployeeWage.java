package com.bridgelabz.Employee_Wage_Computation_Problem;

public class EmployeeWage {

	static final int WAGE_PER_HOUR = 20;
    static final int FULL_DAY_HOURS = 8;
	
	public static void main(String[] args) {
		 
		 System.out.println("Welcome to Employee Wage Computation Program");

	        int attendance = (int) (Math.random() * 2);

	        if (attendance == 1) {

	            int dailyWage = WAGE_PER_HOUR * FULL_DAY_HOURS;

	            System.out.println("Employee Present");
	            System.out.println("Daily Wage = " + dailyWage);

	        } else {

	            System.out.println("Employee Absent");
	            System.out.println("Daily Wage = 0");
	        }
	}

}
