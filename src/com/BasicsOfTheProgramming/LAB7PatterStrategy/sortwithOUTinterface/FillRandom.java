package com.BasicsOfTheProgramming.LAB7PatterStrategy.sortwithOUTinterface;

public class FillRandom {

    public static long[] fillRandom(long A){

        if (A == 0) throw new IllegalArgumentException("There is no point!!!");
        if (A < 0) throw new IllegalArgumentException("Error!!!");

        long[] matrix = new long[(int) A];

        for (int i = 0; i < matrix.length; i++){
            matrix[i] = (long) (Math.random()*33-9);
        }
        return matrix;
    }
}
