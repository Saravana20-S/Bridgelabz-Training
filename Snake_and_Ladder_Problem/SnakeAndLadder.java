package com.bridgelabz.Snake_and_Ladder_Problem;

import java.util.Random;

public class SnakeAndLadder {
	
	public static void main(String[] args) {

        Random random = new Random();

        int dieRoll = random.nextInt(6) + 1;

        System.out.println("Die Number: " + dieRoll);
    }

}
