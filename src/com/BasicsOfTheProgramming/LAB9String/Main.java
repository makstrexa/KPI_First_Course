package com.BasicsOfTheProgramming.LAB9String;

//Task3

public class Main {
    public static void main(String[] args) {
        display(intToOctString(511));
    }

    static String intToOctString(int num) {
        try{
            if(num % 1 != 0) throw new IllegalArgumentException("Can`t be float!!!");
        } catch (Exception error) {
            System.out.println(error.getMessage());
        }
        return Integer.toOctalString(num);
    }

    static void display(String str){
        System.out.println(str);
    }
}

