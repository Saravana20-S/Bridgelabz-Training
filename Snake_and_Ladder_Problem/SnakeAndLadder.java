package com.bridgelabz.Snake_and_Ladder_Problem;

import java.util.Random;

public class SnakeAndLadder {
	
	public static void main(String[] args) {

        Random random = new Random();

        int position = 0;
        int dieRoll = random.nextInt(6) + 1;

        int option = random.nextInt(3);

        if (option == 0) {
            System.out.println("No Play");
        }
        else if (option == 1) {
            position += dieRoll;
            System.out.println("Ladder");
        }
        else {
            position -= dieRoll;
            System.out.println("Snake");
        }

        System.out.println("Position : " + position);
    }

}
