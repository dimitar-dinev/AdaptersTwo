package com.example.movieszadacha.model;

public class Movie {
    private String mTitle;
    private String mGenre;
    private int mYear;

    public Movie(String mTitle, String mGenre, int mYear) {
        this.mTitle = mTitle;
        this.mGenre = mGenre;
        this.mYear = mYear;
    }

    public String getTitle() {
        return mTitle;
    }

    public String getGenre() {
        return mGenre;
    }

    public int getYear() {
        return mYear;
    }
}
