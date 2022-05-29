package com.rpg.rpg;

public abstract class Ennemy {
    public int lifePoints = 50;

    public void setLifePoints(int lifePoints) {

        this.lifePoints = lifePoints;
    }
    public int getLifePoints() {
        return lifePoints;
    }
    public boolean isAlive(){
        if (lifePoints>0){
            return true;
        }
        else {
            return false;
        }
    }
    public boolean isDead(){
        if (lifePoints<=0){
            return true;
        }
        else {
            return false;
        }
    }
}
