package com.BasicsOfTheProgramming.LAB9String.Task9;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        String str1 = ("The user with the nickname koala757677 this month wrote 3 times more comments " +
                "than the user with the nickname croco181dile920 4.txt months ago");
        counterOfComb(str1);
    }

    public static void counterOfComb(String str) {
        String[] words = str.split(" ");

        ArrayList <String> correctWords = new ArrayList<String>();

        if (!words.equals("")) {

            for (String word : words) {

                if (!isNumeric(word)) {

                    char[] charachters = word.toCharArray();

                    for (char charachter : charachters) {

                        if (Character.isDigit(charachter)) {
                            correctWords.add(word);
                            break;
                        }
                    }
                }
            }
        }

        System.out.println(correctWords.size());
    }

    public static boolean isNumeric(String str)
    {
        try
        {
            double d = Double.parseDouble(str);
            int i = Integer.parseInt(str);
            float f = Float.parseFloat(str);
            long l = Long.parseLong(str);
        }
        catch(NumberFormatException nfe)
        {
            return false;
        }
        return true;
    }
}
