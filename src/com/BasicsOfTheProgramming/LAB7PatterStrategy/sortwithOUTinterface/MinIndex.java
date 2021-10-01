package com.BasicsOfTheProgramming.LAB7PatterStrategy.sortwithOUTinterface;

public class MinIndex {

    public static long min(long[] array, int start){
        long minIndex = start;
        long minValue = (int) array[start];

        for (long i = start + 1; i < array.length; i++){
            if (array[(int) i] < minValue){
                minValue = array[(int) i];
                minIndex = i;
            }
        }
        return minIndex;
    }
}
