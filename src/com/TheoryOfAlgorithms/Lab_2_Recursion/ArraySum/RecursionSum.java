package com.TheoryOfAlgorithms.Lab_2_Recursion.ArraySum;

public class RecursionSum {
    public static void main(String[] args) {

        int[] array = fillRandom(100);
        display(array);

        System.out.println(" ");

        printResult(array); // recursion function
        System.out.println("Sum through simple for loop: " + sumOfElement(array)); // for loop

    }

    // display logic
    static int[] fillRandom (int size) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = (int)(Math.random() * 100 - 34);
        }
        return array;
    }

    static void display (int[] arr) {
        for (int element: arr) {
            System.out.print(element + " ");
        }
    }


    // business logic
    static void printResult(int[]arr) {
        try {
            System.out.println("Sum through recursion: " + recursionSum(arr, 0));
        } catch (StackOverflowError e) {
            System.err.println("Stack over flow!");
        } catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
        } catch (NegativeArraySizeException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static int recursionSum (int[] arr, int i) {

        if (i >= arr.length)
            return 0;

        return arr[i] + recursionSum(arr, i + 1);

    }

    static int sumOfElement (int[] arr) {
        int sum = 0;
        for (int element : arr) {
            sum += element;
        }
        return sum;
    }

}
