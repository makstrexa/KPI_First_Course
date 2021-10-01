package com.BasicsOfTheProgramming.LAB7PatterStrategy.sortwithOUTinterface;

public class SelectionSort {

    public static void selectionSort(long[] array){

        for (int step = 0; step < array.length; step++){
            long index_of_min = MinIndex.min(array, step);

            long temp = array[step];
            array[step] = array[(int) index_of_min];
            array[(int) index_of_min] = temp;
        }
    }
}
