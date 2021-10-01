package com.TheoryOfAlgorithms.Lab_4_Sorting.OOPsorting;

public class Randoming implements Random {
    @Override
    public void fillArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100 - 55);
        }
    }
}
