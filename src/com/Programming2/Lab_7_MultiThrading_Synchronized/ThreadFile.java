package com.Programming2.Lab_7_MultiThrading_Synchronized;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class ThreadFile extends Thread {

    private final String fileName;
    HashMap<String, Integer> rareWords = new HashMap<>();

    ThreadFile(String fileName) {
        this.fileName = fileName;
        setName("Thread " + fileName);
        System.out.println("Thread " + fileName + " is created.");
    }

    @Override
    public void run() {

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {

            String line;
            ArrayList<String> words = new ArrayList<>();
            HashMap<String, Integer> map = new HashMap<>();

            while ((line = br.readLine()) != null) {
                if (!line.isEmpty()) {
                    String strWithoutPunct = removePunct(line);
                    String[] string = strWithoutPunct.split(" ");
                    words.addAll(Arrays.asList(string));
                }
            }

            for (String word: words) {
                map.put(word, map.getOrDefault(word, 0) + 1);
            }

            rareWords = rarestWords(map);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    static synchronized HashMap<String, Integer> rarestWords(HashMap<String, Integer> hashMap) {

        HashMap<String, Integer> resultList = new HashMap<>();
        int min = 1;

        for (Map.Entry<String, Integer> pair : hashMap.entrySet())
        {
            String key = pair.getKey();
            Integer value = pair.getValue();
            if (value == min) {
                resultList.put(key, value);
            }

        }

        return  resultList;

    }

    private static final String PUNCT = "!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~";

    public synchronized static String removePunct(String str) {
        StringBuilder result = new StringBuilder(str.length());
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (PUNCT.indexOf(c) < 0) {
                result.append(c);
            }
        }
        return result.toString();
    }

}