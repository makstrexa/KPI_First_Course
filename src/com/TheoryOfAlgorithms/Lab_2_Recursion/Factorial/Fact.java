package com.TheoryOfAlgorithms.Lab_2_Recursion.Factorial;

public class Fact {

    public static void main(String[] args) {
        printFactorial(18);
    }

    static void printFactorial(long x) {
        try {
            System.out.println(fact(x));
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
    }

    static long fact (long x) {

        if (x == 1){
            return 1;
        } else {
            return x * fact(x - 1);
        }

    }

}
