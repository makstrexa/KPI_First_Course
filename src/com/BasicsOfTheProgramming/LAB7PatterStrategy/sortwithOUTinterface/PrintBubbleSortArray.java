package com.BasicsOfTheProgramming.LAB7PatterStrategy.sortwithOUTinterface;

public class PrintBubbleSortArray {

    public static void printBubbleSortArray(long[] arr){

        System.out.println("Bubble sort");

        System.out.println("Virgin array:");
        Display.display(arr);

        BubbleSort.bubbleSort(arr);

        System.out.println("Sorted array(increasingly):");
        Display.display(arr);

        System.out.println("Sorted array(decreasingly):");
        ReverseDisplay.reverseDisplay(arr);
    }
}
