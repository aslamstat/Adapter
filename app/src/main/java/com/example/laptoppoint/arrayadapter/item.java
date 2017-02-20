package com.example.laptoppoint.arrayadapter;

/**
 * Created by Laptop Point on 2/19/2017.
 */

public class item {

    String animalName;
    int animalImage;

    public item(String animalName, int animalImage) {
        this.animalName = animalName;
        this.animalImage = animalImage;

    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public void setAnimalImage(int animalImage) {
        this.animalImage = animalImage;
    }

    public String getAnimalName() {
        return animalName;
    }

    public int getAnimalImage() {
        return animalImage;
    }

}
