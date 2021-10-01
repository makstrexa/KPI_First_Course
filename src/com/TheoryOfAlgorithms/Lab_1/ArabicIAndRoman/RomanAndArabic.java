package com.TheoryOfAlgorithms.Lab_1.ArabicIAndRoman;

import java.util.HashMap;
import java.util.Map;

public class RomanAndArabic {

    public static void main(String[] args) {
        System.out.println(fromRoman(1000));
    }

    static String fromRoman(int originalNum) {

        String romanNum = " ";

        for(Map.Entry<Character, Integer> entry: list().entrySet()) {

            Character key = entry.getKey();
            Integer value = entry.getValue();

            while (value <= originalNum) {
                romanNum += key;
                originalNum -= value;
            }
        }
        return romanNum;
    }

    static HashMap<Character, Integer> list() {
        HashMap<Character, Integer> arabWithRoman = new HashMap<>();

        arabWithRoman.put('I', 1);
        arabWithRoman.put('V', 5);
        arabWithRoman.put('X', 10);
        arabWithRoman.put('L', 50);
        arabWithRoman.put('C', 100);
        arabWithRoman.put('D', 500);
        arabWithRoman.put('M', 1000);

        return  arabWithRoman;
    }

}