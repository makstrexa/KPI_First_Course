package com.Test.First;

import java.util.*;

import com.TheoryOfAlgorithms.Project.TimSort;

public class First {
    public static void main(String[] args) {

        int[] arr = new int[] {3, 4,2,8,1};
        TimSort.timSort(arr, arr.length);
        System.out.println(Arrays.toString(arr));
    }
}

