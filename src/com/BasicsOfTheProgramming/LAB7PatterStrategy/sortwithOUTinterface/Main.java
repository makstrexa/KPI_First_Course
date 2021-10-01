package com.BasicsOfTheProgramming.LAB7PatterStrategy.sortwithOUTinterface;

public class Main {
    public static void main(String[] args) {

        //PrintQuickSortArray.printQuickSortArray(FillRandom.fillRandom(100000));

        //PrintSelectionSortArray.printSelectionSortArray(FillRandom.fillRandom(10));

        //PrintBubbleSortArray.printBubbleSortArray(FillRandom.fillRandom(10));

        //PrintInsertionSortArray.printInsertionSortArray(FillRandom.fillRandom(10));

        long startTime = System.currentTimeMillis();
        QuickSort.quickSort(FillRandom.fillRandom(100000), 0, 100000 - 1);
        long timeSpent = System.currentTimeMillis() - startTime;
        System.out.println(timeSpent);

    }
}
