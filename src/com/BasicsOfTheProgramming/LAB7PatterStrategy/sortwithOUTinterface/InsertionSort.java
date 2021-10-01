package com.BasicsOfTheProgramming.LAB7PatterStrategy.sortwithOUTinterface;

public class InsertionSort {

    public static void insertionSort(long[]arr) {

        for (int left = 0; left < arr.length; left++) {

            int value = (int) arr[left];
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
    }
}
