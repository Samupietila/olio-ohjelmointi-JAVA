package model;

import java.util.HashMap;
import java.util.Locale;

public class Dictionary {
    private HashMap<String, String> dictionary;

    public Dictionary() {
        this.dictionary = new HashMap<>();
    }
    public void addWord(String word, String meaning) {
        this.dictionary.put(word.toLowerCase(), meaning);
    }
    public String getMeaning(String word) {
        return this.dictionary.get(word.toLowerCase());
    }
    public int amountOfWords() {
        return this.dictionary.size();
    }
}
