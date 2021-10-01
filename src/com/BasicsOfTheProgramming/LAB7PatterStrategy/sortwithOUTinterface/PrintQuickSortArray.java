package com.BasicsOfTheProgramming.LAB7PatterStrategy.sortwithOUTinterface;

public class PrintQuickSortArray {
    public static void printQuickSortArray(long[] arr){


        System.out.println("Quick sort");

        System.out.println("Virgin array:");
        Display.display(arr);

        QuickSort.quickSort(arr, 0 , arr.length - 1);

        System.out.println("Sorted array(increasingly):");
        Display.display(arr);

        System.out.println("Sorted array(decreasingly):");
        ReverseDisplay.reverseDisplay(arr);
    }
}
