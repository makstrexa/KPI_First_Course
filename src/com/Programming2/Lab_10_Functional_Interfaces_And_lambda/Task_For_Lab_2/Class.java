package com.Programming2.Lab_10_Functional_Interfaces_And_lambda.Task_For_Lab_2;

public class Class {

    @FunctionalInterface
    interface Function {
        double func(double a, double b, double c, double d);
    }

    public static void main(String[] args) {

        Function function;
        function = (a, b, c, d) -> Math.pow(4 * Math.cosh(Math.sqrt(Math.abs(a/b))) + 3 * Math.acos(d), d);
        System.out.println("Task 2: " + function.func(-3.45, 2.34, 1.45, 0.83));

    }

}
