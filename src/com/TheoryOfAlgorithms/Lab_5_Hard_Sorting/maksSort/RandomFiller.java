package com.TheoryOfAlgorithms.Lab_5_Hard_Sorting.maksSort;

public class RandomFiller implements Filler {
    @Override
    public void fill(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 20001) - 10000;
        }
    }
}
