package com.rpg.rpg;

import javafx.scene.Group;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class Warrior extends Hero {
    private String name;
    private int lifePointsWarrior = 200;
    private int powerWarrior = 50;
    Image photoWarrior = new Image("file:assets/photoWarrior.png");

    public Warrior(String name){
        this.name=name;
        this.power=powerWarrior;
        this.lifePoints=lifePointsWarrior;
        this.setImage(photoWarrior);
        this.setX(350);
        this.setY(495);
        this.setPreserveRatio(true);
        this.setFitWidth(90);

    }

    //sets Warrior picture



    @Override
    public void attack(Ennemy ennemy) {

    }
}
