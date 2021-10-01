package com.Programming2.Lab_7_MultiThrading_Synchronized;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        ArrayList<String> files = new ArrayList<>();

        files.add("C:\\Users\\asus\\IdeaProjects\\KPILABS\\src\\com\\Programming2\\Lab_7_MultiThrading_Synchronized\\1");
        files.add("C:\\Users\\asus\\IdeaProjects\\KPILABS\\src\\com\\Programming2\\Lab_7_MultiThrading_Synchronized\\2");
        files.add("C:\\Users\\asus\\IdeaProjects\\KPILABS\\src\\com\\Programming2\\Lab_7_MultiThrading_Synchronized\\3");
        files.add("C:\\Users\\asus\\IdeaProjects\\KPILABS\\src\\com\\Programming2\\Lab_7_MultiThrading_Synchronized\\4.txt");
        files.add("C:\\Users\\asus\\IdeaProjects\\KPILABS\\src\\com\\Programming2\\Lab_7_MultiThrading_Synchronized\\5.txt");

        ReadListOfFiles reading = new ReadListOfFiles(files);
        reading.readFiles();

        /*
         * Перевірити, що для одних і тих самих файлів результати паралельної
         * обробки не відрізняються від послідовної обробки усіх файлів в одному потоці виконання.
             +

         * Перевірити яким чином кількість та/або розмір файлів, а також кількість потоків впливає
         * на швидкодію. Проаналізувати результати, виявити «вузьке місце» та надати рекомендації
         * щодо збільшення загальної продуктивності.

         */
    }

}
