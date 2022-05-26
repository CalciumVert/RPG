package com.rpg.rpg;

import javafx.scene.image.ImageView;

public abstract class Hero extends ImageView {
    public int lifePoints = 100;
    public int power = 100;

    public void setLifePoints(int lifePoints) {

        this.lifePoints = lifePoints;

    }
    public void setPower(int power){
        this.power = power;
    }

    public int getLifePoints() {
        return lifePoints;
    }

    public int getPower() {
        return power;
    }

    public void attack(Ennemy ennemy){
        ennemy.setLifePoints(ennemy.getLifePoints() - this.power);
    }


}
