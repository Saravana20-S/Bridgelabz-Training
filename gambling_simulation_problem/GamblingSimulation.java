package com.bridgelabz.gambling_simulation_problem;


public class GamblingSimulation {
	
	public static void main(String[] args) {
		 int winningDays = 0;
	        int losingDays = 0;

	        for (int day = 1; day <= 20; day++) {

	            int stake = 100;

	            while (stake > 50 && stake < 150) {

	                if (Math.random() < 0.5) {
	                    stake++;
	                } else {
	                    stake--;
	                }
	            }

	            if (stake == 150) {
	                winningDays++;
	            } else {
	                losingDays++;
	            }
	        }

	        System.out.println("Winning Days: " + winningDays);
	        System.out.println("Losing Days: " + losingDays);
	    }

}
