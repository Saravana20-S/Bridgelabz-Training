package com.bridgelabz.gambling_simulation_problem;


public class GamblingSimulation {

	public static void main(String[] args) {
		int luckiestDay = 0;
		int unluckiestDay = 0;

		int maxWin = Integer.MIN_VALUE;
		int maxLoss = Integer.MAX_VALUE;

		for (int day = 1; day <= 20; day++) {

			int stake = 100;

			while (stake > 50 && stake < 150) {

				if (Math.random() < 0.5) {
					stake++;
				} else {
					stake--;
				}
			}

			int amount = stake - 100;

			if (amount > maxWin) {
				maxWin = amount;
				luckiestDay = day;
			}

			if (amount < maxLoss) {
				maxLoss = amount;
				unluckiestDay = day;
			}
		}

		System.out.println("Luckiest Day: " + luckiestDay +
				" Won $" + maxWin);

		System.out.println("Unluckiest Day: " + unluckiestDay +
				" Lost $" + Math.abs(maxLoss));
		
		
		
		 int totalAmount = 0;

	        for (int day = 1; day <= 20; day++) {

	            int stake = 100;

	            while (stake > 50 && stake < 150) {

	                if (Math.random() < 0.5) {
	                    stake++;
	                } else {
	                    stake--;
	                }
	            }

	            totalAmount += (stake - 100);
	        }

	        System.out.println("Monthly Result: $" + totalAmount);

	        if (totalAmount > 0) {
	            System.out.println("Continue Gambling Next Month");
	        } else {
	            System.out.println("Stop Gambling");
	        }
	    }
	}

