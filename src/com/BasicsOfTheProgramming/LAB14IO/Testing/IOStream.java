package com.BasicsOfTheProgramming.LAB14IO.Testing;

import java.io.*;

public class IOStream {
    public static void main(String[] args) throws IOException {

        copyNoEmptyStrings("C:\\Users\\asus\\Desktop\\text.txt", "C:\\Users\\asus\\Desktop\\textWithoutEmptyStr.txt");
    }

    /*
     * Скопіювати текстовий файл <source> у <destination>,
     * видаливши в процесі копіювання усі порожні рядки.
     */
    static void copyNoEmptyStrings(String source, String destination) throws IOException {
        try(FileReader fr = new FileReader(source);
            BufferedReader br = new BufferedReader(fr);
            BufferedWriter bw = new BufferedWriter(new FileWriter(destination))) {

            String str;
            int lineNumber = 0;

            while ((str = br.readLine()) != null) {
                ++lineNumber;

                if (str.isEmpty())
                    System.out.println(lineNumber + ". empty string");

                else {
                    System.out.println(lineNumber + ". " + str);

                    bw.write(str + "\n");
                }
            }
            System.out.println("\u001B[32mSuccess!");
        }
    }

}




