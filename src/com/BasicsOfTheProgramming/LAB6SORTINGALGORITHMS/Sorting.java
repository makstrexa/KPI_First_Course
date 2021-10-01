package com.BasicsOfTheProgramming.LAB6SORTINGALGORITHMS;

public class Sorting {
    public static void main(String[] args) {

        printFinalBubbleSort(8);
        System.out.println("Insertion Sort");
        printFinalInsertionSort(5);
        printFinalSelectionSort(10);


    }

    public static void printFinalInsertionSort(int A){
        try{
            insertionSort(fillRandom(A));
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }

    public static void printFinalBubbleSort(int A){
        try{
            bubbleSort(fillRandom(A));
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }

    public static void printFinalSelectionSort(int A){
        try{
            selectionSort(fillRandom(A));
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }


    public static void insertionSort(long[]arr) {
        System.out.println("Virgin array:");
        display(arr);
        for (int left = 0; left < arr.length; left++) {
            int value = (int) arr[left];
            int i = left - 1;

            for (; i >= 0; i--) {
                if (value < arr[i]) {
                    arr[i + 1] = arr[i];
                } else {
                    break;
                }
            }
            arr[i + 1] = value;
        }
        System.out.println("Sorted array(increasingly):");
        display(arr);
        System.out.println("Sorted array(decreasingly):");
        reverseDisplay(arr);
    }


    public static void bubbleSort(long[] array){
        System.out.println("Virgin array:");
        display(array);
        boolean isSorted = false;
        while(!isSorted) {
            isSorted = true;
            for (int counter = 1; counter < array.length; counter++) {
                if (array[counter] < array[counter - 1]) {
                    long temp = array[counter];
                    array[counter] = array[counter - 1];
                    array[counter - 1] = temp;
                    isSorted = false;
                }
            }
        }
        System.out.println("Sorted array(increasingly):");
        display(array);
        System.out.println("Sorted array(decreasingly):");
        reverseDisplay(array);
    }


    public static void selectionSort(long[] array){
        System.out.println("Virgin array:");
        display(array);
        for (int step = 0; step < array.length; step++){
            long index_of_min = min(array, step);

            long temp = array[step];
            array[step] = array[(int) index_of_min];
            array[(int) index_of_min] = temp;
        }
        System.out.println("Sorted array(increasingly):");
        display(array);
        System.out.println("Sorted array(decreasingly):");
        reverseDisplay(array);
    }


    public static void display(long[] array){
        for (long elements: array){
            System.out.print(elements + " ");
        }
        System.out.println();
    }

    public static void reverseDisplay(long[] array){
        for (int i = array.length - 1; i >= 0; i--){
            System.out.print(array[i] + " ");
        }
        System.out.println(" ");
    }


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


    static long[] fillRandom(long A){
        if (A == 0) throw new IllegalArgumentException("There is no point!!!");
        if (A < 0) throw new IllegalArgumentException("Error!!!");
        long[] matrix = new long[(int) A];
        for (int i = 0; i < matrix.length; i++){
            matrix[i] = (long) (Math.random()*33-9);
        }
        return matrix;
    }
}
