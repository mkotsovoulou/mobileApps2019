package com.maira.stylesandthemes;

public class Word {
    private String greekWord;
    private String englishWord;
    //private static final int NO_IMAGE_PROVIDED = -1;
    private int imageResourcesId = -1; // -1 means no image
    private int soundResourceId = -1;

    public Word(String englishWord, String greekWord) {
        this.englishWord = englishWord;
        this.greekWord = greekWord;
    }

    public Word(String greekWord, String englishWord, int imageResourcesId) {
        this.greekWord = greekWord;
        this.englishWord = englishWord;
        this.imageResourcesId = imageResourcesId;
    }

    public Word(String greekWord, String englishWord, int imageResourcesId, int soundResourceId) {
        this.greekWord = greekWord;
        this.englishWord = englishWord;
        this.imageResourcesId = imageResourcesId;
        this.soundResourceId = soundResourceId;
    }

    public int getSoundResourceId() {
        return soundResourceId;
    }

    public void setSoundResourceId(int soundResourceId) {
        this.soundResourceId = soundResourceId;
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

    public int getImageResourcesId() {
        return imageResourcesId;
    }

    public void setImageResourcesId(int imageResourcesId) {
        this.imageResourcesId = imageResourcesId;
    }

    @Override
    public String toString() {
        return "Word{" +
                "englishWord='" + englishWord + '\'' +
                ", greekWord='" + greekWord + '\'' +
                '}';
    }
}
