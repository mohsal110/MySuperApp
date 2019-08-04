package com.example.mohsal.mysuperapp;

/**
 * Created by mohsal on 8/3/2019.
 */

public class News {
    private String newsTitle,newsDescription;



    public News(String newsTitle, String newsDescription) {
        this.newsTitle = newsTitle;
        this.newsDescription = newsDescription;

    }

    public String getNewsTitle() {
        return newsTitle;
    }

    public String getNewsDescription() {
        return newsDescription;
    }
}
