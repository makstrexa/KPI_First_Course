package com.TheoryOfAlgorithms.Lab_4_Sorting.OOPsorting;

public class RawDislpayer implements Displayer{
    @Override
    public void display(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(" ");
    }
}
