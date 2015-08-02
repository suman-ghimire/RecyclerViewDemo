package com.example.suman.recyclerviewdemo.pojo;

/**
 * Created by Suman on 7/26/2015.
 */
public class Mypojo {
   String title;
    String description;
    int image;

    public Mypojo(String title, String description, int image) {
        this.image =  image;
        this.description = description;
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public int getImage() {
        return image;
    }
}
