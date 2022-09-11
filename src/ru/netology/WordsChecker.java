package ru.netology;

import java.util.HashSet;
import java.util.Set;

public class WordsChecker {
    private String text;

    public WordsChecker(String text) {
        this.text = text;
    }
    public boolean hasWord(String findText) {
        Set<String> set = new HashSet<>();
        String[] words = text.split("\\P{IsAlphabetic}+");
        for (String word : words) {
            String lowText = word.toLowerCase();
            set.add(lowText);
        }
        String findTextLow = findText.toLowerCase();
        if (set.contains(findTextLow)) {
            System.out.println("Yes Set contains the " + findTextLow + " word");
            return true;
        }
        System.out.println("No Set do not contains the " + findTextLow + " word");
        return false;
    }
}
