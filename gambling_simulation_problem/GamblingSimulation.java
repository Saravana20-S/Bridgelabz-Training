package com.bridgelabz.gambling_simulation_problem;


public class GamblingSimulation {

	
		static final int STAKE = 100;
	    static final int BET = 1;
	    static final int WIN_LIMIT = 150;
	    static final int LOSS_LIMIT = 50;
	    static final int DAYS_IN_MONTH = 20;

	    public static void main(String[] args) {

	        int totalAmount = 0;
	        int winningDays = 0;
	        int losingDays = 0;

	        int luckiestDay = 0;
	        int unluckiestDay = 0;

	        int maxProfit = Integer.MIN_VALUE;
	        int maxLoss = Integer.MAX_VALUE;

	        System.out.println("===== Gambler Simulation =====");

	        for (int day = 1; day <= DAYS_IN_MONTH; day++) {

	            int stake = STAKE;

	            // UC1 & UC2
	            while (stake > LOSS_LIMIT && stake < WIN_LIMIT) {

	                if (Math.random() < 0.5) {
	                    stake += BET; // Win $1
	                } else {
	                    stake -= BET; // Lose $1
	                }
	            }

	            int dailyResult = stake - STAKE;

	            // UC3
	            totalAmount += dailyResult;

	            // UC4
	            if (dailyResult > 0) {
	                winningDays++;
	            } else {
	                losingDays++;
	            }

	            // UC5
	            if (dailyResult > maxProfit) {
	                maxProfit = dailyResult;
	                luckiestDay = day;
	            }

	            if (dailyResult < maxLoss) {
	                maxLoss = dailyResult;
	                unluckiestDay = day;
	            }

	            System.out.println(
	                    "Day " + day +
	                    " : " +
	                    (dailyResult > 0 ? "Won $" : "Lost $") +
	                    Math.abs(dailyResult));
	        }

	        System.out.println("\n===== Monthly Report =====");

	        // UC3
	        System.out.println("Total Amount Won/Lost : $" + totalAmount);

	        // UC4
	        System.out.println("Winning Days : " + winningDays);
	        System.out.println("Losing Days : " + losingDays);

	        // UC5
	        System.out.println("Luckiest Day : Day " + luckiestDay +
	                " (Profit $" + maxProfit + ")");

	        System.out.println("Unluckiest Day : Day " + unluckiestDay +
	                " (Loss $" + Math.abs(maxLoss) + ")");

	        // UC6
	        if (totalAmount > 0) {
	            System.out.println("\nResult: Won this month.");
	            System.out.println("Continue Gambling Next Month.");
	        } else {
	            System.out.println("\nResult: Lost this month.");
	            System.out.println("Stop Gambling.");
	        }
	    }
	}

