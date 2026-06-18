package com.bridgelabz.Snake_and_Ladder_Problem;

import java.util.Random;

public class SnakeAndLadder {
	
	public static void main(String[] args) {

        Random random = new Random();

        int position = 0;

        while (position < 100) {

            int dieRoll = random.nextInt(6) + 1;
            int option = random.nextInt(3);

            switch (option) {

                case 0:
                    break;

                case 1:
                    if (position + dieRoll <= 100) {
                        position += dieRoll;
                    }
                    break;

                case 2:
                    position -= dieRoll;

                    if (position < 0) {
                        position = 0;
                    }
                    break;
            }
        }

        System.out.println("Player Won");
    }
}
