package com.domvit.android.androidlesson9activityresultexam.utils;

/**
 * Created by HiMan on 02.03.2016.
 */
public enum Language {
    UKRAINIAN("Українська"),
    ENGLISH("English"),
    RUSSIAN("Русский");

    private String language;

    Language(String language) {
        this.language = language;
    }

    public String getLanguage() {
        return language;
    }
}
