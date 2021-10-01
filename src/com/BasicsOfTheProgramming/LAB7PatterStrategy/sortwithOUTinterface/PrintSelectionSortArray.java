package com.BasicsOfTheProgramming.LAB7PatterStrategy.sortwithOUTinterface;

public class PrintSelectionSortArray {
    public static void printSelectionSortArray(long[] arr) {

        System.out.println("Selection sort");

        System.out.println("Virgin array:");
        Display.display(arr);

        SelectionSort.selectionSort(arr);

        System.out.println("Sorted array(increasingly):");
        Display.display(arr);

        System.out.println("Sorted array(decreasingly):");
        ReverseDisplay.reverseDisplay(arr);
    }
}
