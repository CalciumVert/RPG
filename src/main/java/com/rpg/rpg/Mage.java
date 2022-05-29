package com.rpg.rpg;

import javafx.scene.image.Image;

public class Mage extends Hero{
    private String name;
    private int lifePointsMage=70;
    private int powerMage=150;
    Image photoMage = new Image("file:assets/photoMage.png");

    public Mage(String name){
        this.name=name;
        this.lifePoints=lifePointsMage;
        this.power=powerMage;
        this.setImage(photoMage);
        this.setX(500);
        this.setY(395);
        this.setPreserveRatio(true);
        this.setFitWidth(90);

    }
    @Override
    public void attack(Ennemy ennemy) {
        ennemy.setLifePoints(ennemy.getLifePoints() - this.power);

    }
}
