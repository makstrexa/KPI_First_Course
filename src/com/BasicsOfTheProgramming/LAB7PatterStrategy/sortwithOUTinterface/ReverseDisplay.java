package com.BasicsOfTheProgramming.LAB7PatterStrategy.sortwithOUTinterface;

public class ReverseDisplay {

    public static void reverseDisplay(long[] array){
        for (int i = array.length - 1; i >= 0; i--){
            System.out.print(array[i] + " ");
        }

        System.out.println(" ");
    }
}
