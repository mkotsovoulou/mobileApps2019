package com.maira.stylesandthemes;

public class Word {
    private String greekWord;
    private String englishWord;

    public Word(String englishWord, String greekWord) {
        this.englishWord = englishWord;
        this.greekWord = greekWord;
    }


    public String getEnglishWord() {
        return englishWord;
    }

    public void setEnglishWord(String englishWord) {
        this.englishWord = englishWord;
    }

    public String getGreekWord() {
        return greekWord;
    }

    public void setGreekWord(String greekWord) {
        this.greekWord = greekWord;
    }

    @Override
    public String toString() {
        return "Word{" +
                "englishWord='" + englishWord + '\'' +
                ", greekWord='" + greekWord + '\'' +
                '}';
    }
}
