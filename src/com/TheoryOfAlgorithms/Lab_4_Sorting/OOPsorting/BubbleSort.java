package com.TheoryOfAlgorithms.Lab_4_Sorting.OOPsorting;

public class BubbleSort implements Sorter {
    @Override
    public void sort(int[] arr) {
        System.out.print(" * " + arr.length + " elements with Bubble sort by");

        long startMS = System.currentTimeMillis();
        long startNano = System.nanoTime();

        int temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length; j++) {
                if (arr[j] < arr[j - 1]) {
                    temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }

        long finishMS = System.currentTimeMillis() - startMS;
        long finishNano = System.nanoTime() - startNano;

        System.out.print(" " + finishMS + " ms and " + finishNano + " nanos\n");

    }
}
