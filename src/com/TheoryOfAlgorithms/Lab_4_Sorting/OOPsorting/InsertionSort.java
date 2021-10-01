package com.TheoryOfAlgorithms.Lab_4_Sorting.OOPsorting;

public class InsertionSort implements Sorter {
    @Override
    public void sort(int[] arr) {
        System.out.print(" * " + arr.length + " * with Insertion sort");

        long startMS = System.currentTimeMillis();
        long startNano = System.nanoTime();

        for (int left = 0; left < arr.length; left++) {

            int value = arr[left];
            int i = left - 1;

            for (; i >= 0; i--) {

                if (value < arr[i]) {

                    arr[i + 1] = arr[i];

                } else {
                    break;
                }
            }
            arr[i + 1] = value;
        }

        long finishMS = System.currentTimeMillis() - startMS;
        long finishNano = System.nanoTime() - startNano;

        System.out.print(" " + finishMS + " ms and " + finishNano + " nanos\n");

    }
}
