package com.BasicsOfTheProgramming.LAB7PatterStrategy.sortwithOUTinterface;

public class BubbleSort {

    public static void bubbleSort(long[] array){

        boolean isSorted = false;

        while(!isSorted) {

            isSorted = true;

            for (int counter = 1; counter < array.length; counter++) {

                if (array[counter] < array[counter - 1]) {

                    long temp = array[counter];
                    array[counter] = array[counter - 1];
                    array[counter - 1] = temp;
                    isSorted = false;
                }
            }
        }
    }
}
