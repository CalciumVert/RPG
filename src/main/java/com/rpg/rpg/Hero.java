package com.rpg.rpg;

public abstract class  Hero {
    public int lifePoints = 100;

    public void setLifePoints(int lifePoints) {

        this.lifePoints = lifePoints;
    }



    public abstract void attack(Ennemy ennemy);


}
