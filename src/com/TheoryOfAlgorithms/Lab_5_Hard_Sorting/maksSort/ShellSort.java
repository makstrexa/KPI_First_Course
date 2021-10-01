package com.TheoryOfAlgorithms.Lab_5_Hard_Sorting.maksSort;

public class ShellSort implements Sorter {
    public long sort(int[] array) {
        long finish;
        long start = System.nanoTime();

        for (int step = array.length / 2; step > 0; step /= 2) {
            for (int i = step; i < array.length; i++) {
                for (int j = i; j >= step && array[j - step] > array[j] ; j -= step) {
                    int temp = array[j];
                    array[j] = array[j - step];
                    array[j - step] = temp;
                }
            }
        }

        finish = System.nanoTime();
        return (finish - start) / 1000000;
    }
}
