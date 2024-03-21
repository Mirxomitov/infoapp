package com.example.infoapptest;

public class PlanetData {

    private final int imageResId;
    private final String name;
    private final String description;

    public PlanetData(int id, String name, String description) {
        this.imageResId = id;
        this.name = name;
        this.description = description;
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
}
