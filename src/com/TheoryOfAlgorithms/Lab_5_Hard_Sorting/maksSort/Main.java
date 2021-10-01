package com.TheoryOfAlgorithms.Lab_5_Hard_Sorting.maksSort;

public class Main {

    public static void main(String[] args) {
        int[] arr100k = new int[100_000];
        int[] arr1m = new int[1_000_000];

        DataProcessor dp = new DataProcessor(new ShellSort(), new RandomFiller());

        dp.filling(arr100k);
        dp.filling(arr1m);

        int[] arr100kQ = arr100k.clone();
        int[] arr1mQ = arr1m.clone();

        int[] arr100kS = arr100k.clone();
        int[] arr1mS = arr1m.clone();

        int[] arr100kM = arr100k.clone();
        int[] arr1mM = arr1m.clone();

        int[] arr100kH = arr100k.clone();
        int[] arr1mH = arr1m.clone();

        System.out.println("\nSorting random array:\n");
        System.out.println("\u001B[36mShell 100k elements: " + dp.sorting(arr100kS) + " ns");
        System.out.println("Shell 1m elements: " + dp.sorting(arr1mS) + " ns");

        dp.setSorter(new MergeSort());
        System.out.println("\u001B[35mMerge 100k elements: " + dp.sorting(arr100kM) + " ns");
        System.out.println("Merge 1m elements: " + dp.sorting(arr1mM) + " ns");

        dp.setSorter(new HeapSort());
        System.out.println("\u001B[32mHeap 100k elements: " + dp.sorting(arr100kH) + " ns");
        System.out.println("Heap 1m elements: " + dp.sorting(arr1mH) + " ns");

        dp.setSorter(new QuickSort());
        System.out.println("\u001B[34mQuick 100k elements: " + dp.sorting(arr100kQ) + " ns");
        System.out.println("Quick 1m elements: " + dp.sorting(arr1mQ) + " ns");
        System.out.println(" ");

        dp.setFiller(new ConsistentFiller());

        dp.filling(arr100k);
        dp.filling(arr1m);

        arr100kQ = arr100k.clone();
        arr1mQ = arr1m.clone();

        arr100kS = arr100k.clone();
        arr1mS = arr1mS.clone();

        arr100kM = arr100k.clone();
        arr1mM = arr1m.clone();

        arr100kH = arr100k.clone();
        arr1mH = arr1m.clone();

        System.out.println("\u001B[30mSorting consistent array:\u001B[30m\n");
        dp.setSorter(new ShellSort());
        System.out.println("\u001B[36mShell 100k elements: " + dp.sorting(arr100kS) + " ns");
        System.out.println("Shell 1m elements: " + dp.sorting(arr1mS) + " ns");

        dp.setSorter(new MergeSort());
        System.out.println("\u001B[35mMerge 100k elements: " + dp.sorting(arr100kM) + " ns");
        System.out.println("Merge 1m elements: " + dp.sorting(arr1mM) + " ns");

        dp.setSorter(new HeapSort());
        System.out.println("\u001B[32mHeap 100k elements: " + dp.sorting(arr100kH) + " ns");
        System.out.println("Heap 1m elements: " + dp.sorting(arr1mH) + " ns");

        dp.setSorter(new QuickSort());
        System.out.println("\u001B[34mQuick 100k elements: " + dp.sorting(arr100kQ) + " ns");
        System.out.println("Quick 1m elements: " + dp.sorting(arr1mQ) + " ns");
    }

}
