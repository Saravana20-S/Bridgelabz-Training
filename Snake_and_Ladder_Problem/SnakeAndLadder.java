package com.bridgelabz.Snake_and_Ladder_Problem;

import java.util.Random;

public class SnakeAndLadder {
	
	 public static void main(String[] args) {

	        Random random = new Random();

	        int position = 0;
	        int diceCount = 0;

	        while (position < 100) {

	            int dieRoll = random.nextInt(6) + 1;
	            int option = random.nextInt(3);

	            diceCount++;

	            switch (option) {

	                case 0:
	                    System.out.println("No Play");
	                    break;

	                case 1:
	                    if (position + dieRoll <= 100) {
	                        position += dieRoll;
	                    }
	                    System.out.println("Ladder");
	                    break;

	                case 2:
	                    position -= dieRoll;

	                    if (position < 0) {
	                        position = 0;
	                    }

	                    System.out.println("Snake");
	                    break;
	            }

	            System.out.println("Die : " + dieRoll +
	                    " Position : " + position);
	        }

	        System.out.println("Total Dice Rolls : " + diceCount);
	    }
}
