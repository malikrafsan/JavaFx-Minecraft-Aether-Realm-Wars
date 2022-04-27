package com.aetherwars.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.File;
import java.io.InputStream;

public class HandCardController {
    @FXML private ImageView cardImageView;
    @FXML private Label labelMana;
    @FXML private Label labelAttr;



    public void setLabelMana(Integer value){
        this.labelMana.setText("MANA " + value.toString());
    }

    public void setLabelAttr(String value){
        this.labelAttr.setText(value);
    }

    public void setCardImageView(String imagePath){
        try {
            InputStream inputStream = getClass().getResourceAsStream(imagePath);
            Image cardImage  = new Image(inputStream);
            this.cardImageView.setImage(cardImage);
        }
        catch (Exception e){
            System.out.println(e);
        }
    }

}
