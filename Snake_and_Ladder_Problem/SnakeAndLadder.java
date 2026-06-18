package com.bridgelabz.Snake_and_Ladder_Problem;

import java.util.Random;

public class SnakeAndLadder {
	
	  public static void main(String[] args) {

	        Random random = new Random();

	        int player1 = 0;
	        int player2 = 0;

	        while (player1 < 100 && player2 < 100) {

	            player1 = playTurn(player1, random);

	            if (player1 == 100) {
	                System.out.println("Player 1 Won");
	                break;
	            }

	            player2 = playTurn(player2, random);

	            if (player2 == 100) {
	                System.out.println("Player 2 Won");
	                break;
	            }
	        }
	    }

	    public static int playTurn(int position, Random random) {

	        boolean playAgain = true;

	        while (playAgain) {

	            int dieRoll = random.nextInt(6) + 1;
	            int option = random.nextInt(3);

	            playAgain = false;

	            switch (option) {

	                case 0:
	                    break;

	                case 1:
	                    if (position + dieRoll <= 100) {
	                        position += dieRoll;
	                    }
	                    playAgain = true;
	                    break;

	                case 2:
	                    position -= dieRoll;

	                    if (position < 0) {
	                        position = 0;
	                    }
	                    break;
	            }
	        }

	        return position;
	    }
}
