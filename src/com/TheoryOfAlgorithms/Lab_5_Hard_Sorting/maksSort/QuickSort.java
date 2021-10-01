package com.TheoryOfAlgorithms.Lab_5_Hard_Sorting.maksSort;

public class QuickSort implements Sorter{
    public long sort(int[] arr) {
        long finish;
        long start = System.nanoTime();

        quickSort(arr, 0, arr.length - 1);

        finish = System.nanoTime();
        return (finish - start) / 1000000;
    }

    public static void quickSort(int[] arr, long from, long to) {


        if (from < to) {

            long divideIndex = portioning(arr, from, to);

            quickSort(arr, from, divideIndex - 1);

            quickSort(arr, divideIndex, to);
        }
    }


    public static int portioning(int[] arr, long from, long to) {
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


    public static void swap(int[] array, long index1, long index2) {
        long tmp = array[(int) index1];
        array[(int) index1] = array[(int) index2];
        array[(int) index2] = (int) tmp;
    }
}
