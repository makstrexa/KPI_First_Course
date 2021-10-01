package com.TheoryOfAlgorithms.Lab_5_Hard_Sorting.maksSort;

public class ConsistentFiller implements Filler {
    @Override
    public void fill(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = i+1;
        }
    }
}