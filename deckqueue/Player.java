package com.bridgelabz.deckqueue;

public class Player {

    private String name;
    private Queue cards;

    public Player(String name) {
        this.name = name;
        cards = new Queue();
    }

    public void addCard(String card) {
        cards.enqueue(card);
    }

    public void displayCards() {

        System.out.println("\n" + name);

        cards.display();
    }
}