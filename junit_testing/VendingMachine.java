package com.bridgelabz.junit_testing;


import java.util.ArrayList;
import java.util.List;

public class VendingMachine {

    private static final int[] NOTES = {1000, 500, 100, 50, 10, 5, 2, 1};

    public static List<Integer> getMinimumNotes(int amount) {
        List<Integer> result = new ArrayList<>();
        calculateNotes(amount, 0, result);
        return result;
    }

    private static void calculateNotes(int amount, int index, List<Integer> result) {

        if (amount == 0 || index >= NOTES.length) {
            return;
        }

        int note = NOTES[index];

        while (amount >= note) {
            result.add(note);
            amount -= note;
        }

        calculateNotes(amount, index + 1, result);
    }

    public static int getNoteCount(int amount) {
        return getMinimumNotes(amount).size();
    }
}