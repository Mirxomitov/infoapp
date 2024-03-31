package com.example.infoapptest;

public class PlanetData {
    private final int imageResId;
    private final String name;
    private final String description;
    private final String title;

    public PlanetData(int id, String name, String title,  String description) {
        this.imageResId = id;
        this.name = name;
        this.description = description;
        this.title = title;
    }

    public int getImageResId() {
        return imageResId;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getTitle() {
        return title;
    }
}


