package com.example.mohsal.mysuperapp;

/**
 * Created by mohsal on 8/3/2019.
 */

public class MenuElements {
    String title;
    int logo;

    public MenuElements(String title, int logo) {
        this.title = title;
        this.logo = logo;
    }

    public String getTitle() {
        return title;
    }

    public int getLogo() {
        return logo;
    }
}
