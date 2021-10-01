package com.BasicsOfTheProgramming.LAB7PatterStrategy.sortwithOUTinterface;

public class PrintInsertionSortArray {
    public  static void printInsertionSortArray(long[] arr){

        System.out.println("Insertion sort");

        System.out.println("Virgin array:");
        Display.display(arr);

        InsertionSort.insertionSort(arr);

        System.out.println("Sorted array(increasingly):");
        Display.display(arr);

        System.out.println("Sorted array(decreasingly):");
        ReverseDisplay.reverseDisplay(arr);
    }
}
