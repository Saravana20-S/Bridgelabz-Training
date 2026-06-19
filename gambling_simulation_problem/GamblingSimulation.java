package com.bridgelabz.gambling_simulation_problem;


public class GamblingSimulation {

	public static void main(String[] args) {
		int month = 1;

        while (true) {

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

            System.out.println("Month " + month +
                    " Result: $" + totalAmount);

            if (totalAmount <= 0) {
                System.out.println("Stopping Gambling");
                break;
            }

            month++;
        }
    }
	}

