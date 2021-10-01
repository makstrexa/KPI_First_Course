package com.TheoryOfAlgorithms.Lab_4_Sorting.OOPsorting;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Client client1 = new Client(new BubbleSort(), new Randoming());

        // creating arrays(1_000 elements)
        int[] arr1 = new int[1_000];
        Randoming r = new Randoming();
        r.fillArr(arr1);
        int[] arr2 = Arrays.copyOf(arr1, arr1.length);
        int[] arr3 = Arrays.copyOf(arr1, arr1.length);
        // creating arrays(10_000 elements)
        int[] arr4 = new int[10_000];
        r.fillArr(arr1);
        int[] arr5 = Arrays.copyOf(arr4, arr4.length);
        int[] arr6 = Arrays.copyOf(arr4, arr4.length);
        // creating arrays(100_000 elements)
        int[] arr7 = new int[100_000];
        r.fillArr(arr1);
        int[] arr8 = Arrays.copyOf(arr7, arr7.length);
        int[] arr9 = Arrays.copyOf(arr7, arr7.length);
        // finish creating

        //BUBBLE SORT

        System.out.println("\u001B[32mBubble sort on random arrays\u001B[0m");
        client1.processing(arr1);
        client1.processing(arr4);
        client1.processing(arr7);

        // already sorting arrays sort with Bubble sort
        System.out.println("\u001B[32mAlready sorting arrays sort with Bubble sort\u001B[0m");
        client1.processDataSimple(1_000);
        client1.processDataSimple(10_000);
        client1.processDataSimple(100_000);

        //end Bubble Sort

        // INSERTION SORT
        client1.setSorter(new InsertionSort());
        System.out.println("\u001B[33mInsertion sort on random arrays\u001B[0m");
        client1.processing(arr2);
        client1.processing(arr5);
        client1.processing(arr8);
        // already sorting arrays sort with Insertion sort
        System.out.println("\u001B[33mAlready sorting arrays sort with Insertion sort\u001B[0m");
        client1.processDataSimple(1_000);
        client1.processDataSimple(10_000);
        client1.processDataSimple(100_000);

        //end Insertion Sort

        // SELECTION SORT
        client1.setSorter(new SelectionSort());
        System.out.println("\u001B[35mSelection sort on random arrays\u001B[0m");
        client1.processing(arr3);
        client1.processing(arr6);
        client1.processing(arr9);
        // already sorting arrays sort with Insertion sort
        System.out.println("\u001B[35mAlready sorting arrays sort with Selection sort\u001B[0m");
        client1.processDataSimple(1_000);
        client1.processDataSimple(10_000);
        client1.processDataSimple(100_000);

    }
}
