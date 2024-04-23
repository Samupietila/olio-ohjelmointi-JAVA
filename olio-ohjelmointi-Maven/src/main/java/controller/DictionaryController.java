package controller;

import model.Dictionary;
import view.DictionaryView;

public class DictionaryController {
    private Dictionary dictionary;
    private DictionaryView view;

    public DictionaryController(DictionaryView view) {
        this.dictionary = new Dictionary();
        this.view = view;

    }

    public void addWord(String word, String meaning) {
        dictionary.addWord(word, meaning);
        view.addWord(word, meaning);
    }

    public void getMeaning(String word) {
        if (dictionary.getMeaning(word) == null) {
            view.setMeaning("Word not found");
        }
        else {
            view.setMeaning(dictionary.getMeaning(word));
        }
    }
}
