package org.example.SortedAssociativeArrays;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Index {
    private Map<String, Integer> frequencyTable;

    public Index() {
        frequencyTable = new HashMap<>();
    }

    public Index(String initialText) {
        frequencyTable = new HashMap<>();
        appendText(initialText);
    }

    public void appendText(String text) {
        text = text.replaceAll("[^a-zA-Zа-яА-Я ]", "").toLowerCase();
        String[] words = text.split("\\s+");

        for (String word : words) {
            if (!word.isEmpty()) {
                frequencyTable.put(word, frequencyTable.getOrDefault(word, 0) + 1);
            }
        }
    }

    public int getWordFrequency(String word) {
        return frequencyTable.getOrDefault(word.toLowerCase(), 0);
    }

    public Map<String, Integer> getFrequencyTable() {
        Map<String, Integer> sortedFrequencyTable = new TreeMap<>(frequencyTable);
        return sortedFrequencyTable;
    }



}
