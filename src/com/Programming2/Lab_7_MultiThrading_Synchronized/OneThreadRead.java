package com.Programming2.Lab_7_MultiThrading_Synchronized;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class OneThreadRead {

    static List<String> rarestWords(HashMap<String, Integer> hashMap) {

        List<String> resultList = new ArrayList<>();
        int min = 1;

        for (Map.Entry<String, Integer> pair : hashMap.entrySet())
        {
            String key = pair.getKey();
            Integer value = pair.getValue();
            if (value == min)
                resultList.add(key);

        }

        return  resultList;

    }

    static HashMap<String, Integer> rarestWordsInMap(HashMap<String, Integer> hashMap) {

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

    static HashMap<String, Integer> mapping(String filename) throws FileNotFoundException {

        String str;

        List<String> words = new ArrayList<>();
        HashMap<String, Integer> map = new HashMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {

            while ((str = br.readLine()) != null) {

                if (!str.isEmpty()) {
                    String strWithoutPunct = removePunct(str);
                    String[] string = strWithoutPunct.split(" ");
                    words.addAll(Arrays.asList(string));
                }

            }

            for (String i : words) {
                Integer value = map.get(i);
                if (value == null) {
                    map.put(i, 1);
                } else {
                    map.put(i, ++value);
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return map;

    }

    private static final String PUNCT = "!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~";

    public static String removePunct(String str) {
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
