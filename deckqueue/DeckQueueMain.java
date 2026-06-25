package com.bridgelabz.deckqueue;

import java.util.Random;

public class DeckQueueMain {

    public static void main(String[] args) {

        String[] suits = {
                "Clubs",
                "Diamonds",
                "Hearts",
                "Spades"
        };

        String[] ranks = {
                "2", "3", "4", "5", "6", "7",
                "8", "9", "10", "Jack",
                "Queen", "King", "Ace"
        };

        String[] deck = new String[52];

        int index = 0;

        for (String suit : suits) {
            for (String rank : ranks) {
                deck[index++] =
                        rank + " of " + suit;
            }
        }

        Random random = new Random();

        for (int i = 0; i < deck.length; i++) {

            int r = random.nextInt(52);

            String temp = deck[i];
            deck[i] = deck[r];
            deck[r] = temp;
        }

        Player[] players = {
                new Player("Player 1"),
                new Player("Player 2"),
                new Player("Player 3"),
                new Player("Player 4")
        };

        index = 0;

        for (int i = 0; i < 4; i++) {

            for (int j = 0; j < 9; j++) {

                players[i]
                        .addCard(deck[index++]);
            }
        }

        for (Player player : players) {
            player.displayCards();
        }
    }
}