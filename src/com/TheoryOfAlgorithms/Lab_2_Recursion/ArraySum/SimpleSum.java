package com.TheoryOfAlgorithms.Lab_2_Recursion.ArraySum;

public class SimpleSum {
    public static void main(String[] args) {
        int[] array = new int[] {3,5,7,8,9,4,5};
        printResult(array);
    }

    static void printResult(int[] arr) {
        try {
            System.out.println(sumOfElement(arr));
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        } catch (NegativeArraySizeException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static int sumOfElement (int[] arr) {
        int sum = 0;
        for (int element : arr) {
            sum += element;
        }
        return sum;
    }

}
