package com.TheoryOfAlgorithms.Lab_2_Recursion.Sqrt;

public class Sqrt {
    public static void main(String[] args) {
        System.out.println(recursionSqrt(3, 6, 2));
    }

    static double recursionSqrt(int depth, int a, int b) {
        if (depth == 1) return Math.sqrt(a+b);
        return Math.sqrt( a + ( b * (recursionSqrt(depth - 1,a + 1,b + 1))));

    }

}
