package com.example.f_mkotsovoulou;

/**
 * Created by f-mkotsovoulou on 10/20/2016.
 */
public class Word {
    private String englishWord;
    private String greekWork;

    /** Image resource ID for the word */
    private int imageResourcesId = NO_IMAGE_PROVIDED;

    /** Audio resource ID for the word */
    private int audioResourceId;

    private static final int NO_IMAGE_PROVIDED = -1;

    public Word(String englishWord, String greekWork, int imageResourcesId, int audioResourceId) {
        this.englishWord = englishWord;
        this.greekWork = greekWork;
        this.imageResourcesId = imageResourcesId;
        this.audioResourceId = audioResourceId;
    }

    public Word(String englishWord, String greekWork, int audioResourceId) {
        this.englishWord = englishWord;
        this.greekWork = greekWork;
        this.audioResourceId = audioResourceId;
    }

    public String getEnglishWord() {
        return englishWord;
    }

    public void setEnglishWord(String englishWord) {
        this.englishWord = englishWord;
    }

    public String getGreekWork() {
        return greekWork;
    }

    public void setGreekWork(String greekWork) {
        this.greekWork = greekWork;
    }

    public int getImageResourcesId() {
        return imageResourcesId;
    }

    public void setImageResourcesId(int imageResourcesId) {
        this.imageResourcesId = imageResourcesId;
    }

    public int getAudioResourceId() {
        return audioResourceId;
    }

    public void setAudioResourceId(int audioResourceId) {
        this.audioResourceId = audioResourceId;
    }

}
