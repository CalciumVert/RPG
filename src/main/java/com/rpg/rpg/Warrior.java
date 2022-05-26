package com.rpg.rpg;

import javafx.scene.Group;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class Warrior extends Hero {
    private String name;
    private int lifePointsWarrior = 200;
    private int powerWarrior = 50;
    public Warrior(String name){
        this.name=name;
        this.power=powerWarrior;
        this.lifePoints=lifePointsWarrior;

    }

    //sets Warrior picture
    Image photoWarrior = new Image("file:assets/photoWarrior.png");
    ImageView imWarrior = new ImageView();
        imWarrior.setImage(photoWarrior);
        imWarrior.setX(350);
        imWarrior.setY(495);
        imWarrior.setPreserveRatio(true);
        imWarrior.setFitWidth(90);
        root.getChildren().add(imWarrior);

    @Override
    public void attack(Ennemy ennemy) {

    }
}
