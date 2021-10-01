package com.TheoryOfAlgorithms.Lab_1.Subsets;

import java.util.ArrayList;

public class Subsets {
    public static void main(String[] args) {
        generationSets(5, 10);
    }

    static void generationSets(int N, int deep) {

        ArrayList<Integer> array = new ArrayList<>();

        for (int i = 1; i <= N; i++) {
            array.add(i);
        }
        display(array);


    }

    static void display(ArrayList<Integer> anySet) {
        for (int num : anySet) {
            System.out.print(num + " ");
        }
    }
}


