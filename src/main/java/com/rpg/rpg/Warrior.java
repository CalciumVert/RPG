package com.rpg.rpg;

public class Warrior extends Hero {
    private String name;
    private int lifePointsWarrior = 200;
    public Warrior(String name){
        this.name=name;
        this.lifePoints=lifePointsWarrior;

    }
    @Override
    public void attack(Ennemy ennemy) {

    }
}
