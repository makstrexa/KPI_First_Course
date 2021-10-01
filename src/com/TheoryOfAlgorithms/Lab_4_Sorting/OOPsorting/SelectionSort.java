package com.TheoryOfAlgorithms.Lab_4_Sorting.OOPsorting;

public class SelectionSort implements Sorter {
    @Override
    public void sort(int[] array) {
        System.out.print(" * " + array.length + " * with Selection sort");

        long startMS = System.currentTimeMillis();
        long startNano = System.nanoTime();

        for (int step = 0; step < array.length; step++){
            int index_of_min = min(array, step);

            int temp = array[step];
            array[step] = array[index_of_min];
            array[index_of_min] = temp;
        }

        long finishMS = System.currentTimeMillis() - startMS;
        long finishNano = System.nanoTime() - startNano;

        System.out.print(" " + finishMS + " ms and " + finishNano + " nanos\n");

    }
    public static int min(int[] array, int start){
        int minIndex = start;
        int minValue = array[start];

        for (int i = start + 1; i < array.length; i++){
            if (array[i] < minValue){
                minValue = array[i];
                minIndex = i;
            }
        }
        return minIndex;
    }
}
