package com.example.coursedesigner.obstacles;

import java.io.Serializable;

public class Obstacle implements Serializable {
    private String name;
    private int image;

    public Obstacle(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
