package com.example.coursedesigner.combinaisons;

import java.io.Serializable;

public class Combinaison implements Serializable {
    private String name;
    private int image;

    public Combinaison(){

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
