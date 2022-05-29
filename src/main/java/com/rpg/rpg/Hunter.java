package com.rpg.rpg;

import javafx.scene.image.Image;

public class Hunter extends Hero{
    private String name;
    private int lifePointsHunter=80;
    private int powerHunter=130;
    Image photoHunter = new Image("file:assets/photoHunter.png");

    public Hunter(String name){
        this.name=name;
        this.lifePoints=lifePointsHunter;
        this.power=powerHunter;
        this.setImage(photoHunter);
        this.setX(500);
        this.setY(495);
        this.setPreserveRatio(true);
        this.setFitWidth(70);

    }
    @Override
    public void attack(Ennemy ennemy) {

    }
}
