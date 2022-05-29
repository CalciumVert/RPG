package com.rpg.rpg;

import javafx.scene.image.Image;

public class Healer extends Hero{
    private String name;
    private int lifePointsHealer=150;
    private int powerHealer=35;
    Image photoHealer = new Image("file:assets/photoHealer.png");

    public Healer(String name){
        this.name=name;
        this.lifePoints=lifePointsHealer;
        this.power=powerHealer;
        this.setImage(photoHealer);
        this.setX(400);
        this.setY(295);
        this.setPreserveRatio(true);
        this.setFitWidth(90);

    }
    @Override
    public void attack(Ennemy ennemy) {

    }
}
