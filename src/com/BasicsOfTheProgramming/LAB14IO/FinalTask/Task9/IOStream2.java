package com.BasicsOfTheProgramming.LAB14IO.FinalTask.Task9;

import java.io.*;

public class IOStream2 {
    public static void main(String[] args) throws IOException {

        String fileName = "src\\com\\BasicsOfTheProgramming\\LAB14IO\\FinalTask\\Task9\\anyfile.bin";

        try (FileOutputStream fos = new FileOutputStream(fileName);
             ObjectOutputStream os = new ObjectOutputStream(fos)) {

            os.writeInt(2048);
            os.writeDouble(1.1324);
            os.writeUTF("Hello World!");
            os.writeUTF("+3803803800");
            os.writeInt(2_000_000);
            os.writeUTF("JAVA");
            os.writeDouble(1_000_000.3456);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Done writing! Now reading...");

        System.out.println(longestZeroSequenceLength(fileName));
    }

    /*
     * Знайти довжину найдовшої послідовності двійкового файлу,
     * що складається з байтів зі значенням 0.
     */
    static long longestZeroSequenceLength(String filename) {

        long theLongest = 1;
        int counter = 1;
        int i = 0;

        try (InputStream fileIs = new FileInputStream(filename);
             ObjectInputStream is = new ObjectInputStream(fileIs)) {

            byte[] allBytes = new byte[(int) filename.length()];
            int byteRead;

            while ((byteRead = is.read()) != -1) {
                allBytes[i] = (byte) byteRead;
                i++;
            }

            for (int j = 0; j < allBytes.length; j++) {
                System.out.print(allBytes[j] + " ");
            }
            System.out.println(" ");

            for (int k = 1; k < allBytes.length; k++) {
                if (allBytes[k] == 0 && allBytes[k - 1] == 0) {
                    counter++;
                } else {
                    counter = 1;
                }
                if (theLongest < counter) {
                    theLongest = counter;
                }
            }

        } catch (IOException e) {
            System.err.println("ERR");
        }
        return counter;
    }
}