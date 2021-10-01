package com.TheoryOfAlgorithms.Lab_2_Recursion.AckermanFunction;

public class Ackermann {
    public static void main(String[] args) {
        printAckerman(4, 1);
    }

    static void printAckerman(long m, long n) {
        try {
            System.out.println("For m = " + m + " and n = " + n + " ackermannfunc = " + ackermann(m, n));
        } catch (StackOverflowError e) {
            System.err.println("StackOverflowError!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static long ackermann(long m,long n){

        if (m == 0) return n + 1;
        else if (m > 0 && n == 0) return ackermann(m - 1, 1);
        else return ackermann(m - 1, ackermann(m, n - 1));

    }

}
