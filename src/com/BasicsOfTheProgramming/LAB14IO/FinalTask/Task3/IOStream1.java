package com.BasicsOfTheProgramming.LAB14IO.FinalTask.Task3;

import java.io.*;

public class IOStream1 {
    public static void main(String[] args) throws IOException {

        copyNoEmptyStrings("src\\com\\BasicsOfTheProgramming\\LAB14IO\\FinalTask\\Task3\\file1.txt",
                        "src\\com\\BasicsOfTheProgramming\\LAB14IO\\FinalTask\\Task3\\file2.txt");

    }

    /*
     * Скопіювати текстовий файл <source> у <destination>,
     * видаливши в процесі копіювання усі порожні рядки.
     */
    static void copyNoEmptyStrings(String source, String destination) {
        try(BufferedReader br = new BufferedReader(new FileReader(source));
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
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
