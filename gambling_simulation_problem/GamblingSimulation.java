package com.bridgelabz.gambling_simulation_problem;


public class GamblingSimulation {
	
	public static void main(String[] args) {
		int stake = 100;
        int bet = 1;

        while (stake > 50 && stake < 150) {
            if (Math.random() < 0.5)
                stake += bet;
            else
                stake -= bet;
        }

        System.out.println("Final Stake: $" + stake);
		
	}

}
