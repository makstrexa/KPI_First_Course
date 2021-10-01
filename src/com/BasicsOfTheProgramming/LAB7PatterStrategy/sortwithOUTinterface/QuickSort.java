package com.BasicsOfTheProgramming.LAB7PatterStrategy.sortwithOUTinterface;

public class QuickSort {

    public static void quickSort(long[] arr, long from, long to) {


        if (from < to) {

            long divideIndex = portioning(arr, from, to);

            quickSort(arr, from, divideIndex - 1);

            quickSort(arr, divideIndex, to);
        }
    }


    public static int portioning(long[] arr, long from, long to) {
        long rightIndex = to;
        long leftIndex = from;

        long pivot = arr[(int) (from + (to - from) / 2)];
        while (leftIndex <= rightIndex) {

            while (arr[(int) leftIndex] < pivot) {
                leftIndex++;
            }

            while (arr[(int) rightIndex] > pivot) {
                rightIndex--;
            }

            if (leftIndex <= rightIndex) {
                swap(arr, rightIndex, leftIndex);
                leftIndex++;
                rightIndex--;
            }
        }
        return (int) leftIndex;
    }


    public static void swap(long[] array, long index1, long index2) {
        long tmp = array[(int) index1];
        array[(int) index1] = array[(int) index2];
        array[(int) index2] = tmp;
    }
}
