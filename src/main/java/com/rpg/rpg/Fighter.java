package com.rpg.rpg;

import javafx.scene.image.Image;

public class Fighter extends Hero{
    private String name;
    private int lifePointsFighter=100;
    private int powerFighter=100;
    Image photoFighter = new Image("file:assets/photoFighter.png");

    public Fighter(String name){
        this.name=name;
        this.lifePoints=lifePointsFighter;
        this.power=powerFighter;
        this.setImage(photoFighter);
        this.setX(400);
        this.setY(395);
        this.setPreserveRatio(true);
        this.setFitWidth(90);

    }
    @Override
    public void attack(Ennemy ennemy) {

    }
}
