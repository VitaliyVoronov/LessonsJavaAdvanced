package ua.itea.homeWork03Collections;

import java.util.HashMap;
import java.util.Map;

/**
 * @author vitaliy
 * @version 1.0
 * @since 2/5/17
 */
public class MyTranslator {

    private Map<String,String> vocabularyMap;
    private final String VOCABULARY_PATH = "vocabulary.txt";
    private ReadVocabulary readVocabulary;

    public MyTranslator() {
        this.vocabularyMap = new HashMap<>();
        this.readVocabulary = new ReadVocabulary(VOCABULARY_PATH);
        readVocabularyFromFileAndAddToMap();
    }

    public void addNewWordsToVocabulary(String englishWord, String russianWord){
        vocabularyMap.put(englishWord,russianWord);
    }

    public String translateAllEnglishTextToRussian(String text){
        String[] sentences = text.toLowerCase().split("\\.");
        String russianText = "";
        for (String oneSentence : sentences) {
            String russianSentence = "";
            String [] words = oneSentence.trim().split(" ");
            int countWords = 0;
            for (String oneWord: words){
                String russianWord = translateOneEnglishWordToRussian(oneWord.trim());
                if (russianWord != null && russianWord.length() > 0 ){
                    if (countWords == 0){
                        russianSentence += toUpperFirstLater(russianWord) +" ";
                    } else {
                        russianSentence += russianWord + " ";
                    }
                } else {
                    if (countWords == 0){
                        russianSentence += toUpperFirstLater(oneWord)+" ";
                    } else {
                        russianSentence += oneWord + " ";
                    }
                }
                ++countWords;
            }
            russianText += russianSentence.trim() + ". ";
        }

        return russianText.trim();
    }

    private String toUpperFirstLater(String word){
        String str = word.substring(0,1).toUpperCase() + word.substring(1);
        return str;
    }

    public String translateOneEnglishWordToRussian(String englishWord){
        return vocabularyMap.get(englishWord);
    }

    public String translateFromRussian(String russianWord){
        String translateWord = null;
        for(Map.Entry entry: vocabularyMap.entrySet()) {
            if (entry.getValue().equals(russianWord)) {
                translateWord = entry.getKey().toString();
            }
        }
        return translateWord;
    }

        public void readVocabularyFromFileAndAddToMap() {
            String[] allPareWords = readVocabulary.readAllFromFile().split("\n");
            String[] onePareWords;
            for (String s: allPareWords) {
                onePareWords = s.split("/");
                String englishWord = onePareWords[0];
                String russianWord;
                if (onePareWords.length < 2){
                    russianWord = " ";
                } else {
                    russianWord = onePareWords[1];
                }
                vocabularyMap.put(englishWord,russianWord);
            }
        }

    }
