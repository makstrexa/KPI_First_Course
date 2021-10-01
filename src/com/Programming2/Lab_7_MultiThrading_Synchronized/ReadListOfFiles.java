package com.Programming2.Lab_7_MultiThrading_Synchronized;

import java.io.FileNotFoundException;
import java.util.*;

public class ReadListOfFiles {

    private final ArrayList<String> files;
    private HashMap<String, Integer> rareWords;

    public ReadListOfFiles(ArrayList<String> files) {
        this.files = files;
    }

    public void readFiles() throws FileNotFoundException {

        System.out.println("**** Few threads ****");
        long start = System.currentTimeMillis();
        rareWords = rareWordsInFiles(files);
        long finish = System.currentTimeMillis() - start;
        System.out.println("Ready for: " + finish + " ms.");
        displayRarest();
        System.out.println("**** One Thread ****");
        long start1 = System.currentTimeMillis();
        rareWords = oneThreadRare(files);
        long finish1 = System.currentTimeMillis() - start1;
        System.out.println("Ready for: " + finish1 + " ms.");
        System.out.println("Rarest words:");
//        displayRarest();

    }

    private HashMap<String, Integer> rareWordsInFiles(ArrayList<String> files) {

        HashMap<String, Integer> rareWordsInFilesTemp = new HashMap<>();
        List<ThreadFile> threads = new ArrayList<>();
        ThreadFile thread;

        for (String file: files) {
            thread = new ThreadFile(file);
            threads.add(thread);
            thread.start();
        }

        for (ThreadFile t: threads) {
            try {
                t.join();
                for (String word: t.rareWords.keySet()) {
                    rareWordsInFilesTemp.put(word, rareWordsInFilesTemp.getOrDefault(word, 0) + t.rareWords.get(word));
                }
            } catch (InterruptedException exception) {
                exception.printStackTrace();
            }
        }

        return ThreadFile.rarestWords(rareWordsInFilesTemp);

    }

    private HashMap<String, Integer> oneThreadRare(ArrayList<String> files) throws FileNotFoundException {

        HashMap<String, Integer> rareWordsInFiles;
        HashMap<String, Integer> res = new HashMap<>();

        for (String file: files) {
            rareWordsInFiles = OneThreadRead.mapping(file);
            res = OneThreadRead.rarestWordsInMap(rareWordsInFiles);

        }

        return res;
    }

    public void displayRarest() {
        for (String word: rareWords.keySet()) {
            System.out.println("Word: " + word + ": " + rareWords.get(word));
        }
    }

}
