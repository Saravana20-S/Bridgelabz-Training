package com.bridgelabz.deckqueue;

public class Queue {

    private Node front;
    private Node rear;

    public void enqueue(String data) {

        Node node = new Node(data);

        if (rear == null) {
            front = rear = node;
            return;
        }

        rear.next = node;
        rear = node;
    }

    public void display() {

        Node temp = front;

        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}