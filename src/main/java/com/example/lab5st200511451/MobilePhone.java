package com.example.lab5st200511451;

import javafx.scene.image.Image;

public class MobilePhone {

    private String model;

    private String path;

    public MobilePhone(String model, String path){

        this.model = model;

        this.path = path;
    }

    public Image getImage(){

        return new Image(MobilePhone.class.getResourceAsStream(path));
    }

    public String getModel(){

        return this.model;
    }
}
