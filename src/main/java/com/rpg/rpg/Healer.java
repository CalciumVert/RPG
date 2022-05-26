package com.rpg.rpg;

public class Healer extends Hero{
    private String name;
    private int lifePointsHealer=150;
    private int powerHealer=35;
    public Healer(String name){
        this.name=name;
        this.lifePoints=lifePointsHealer;
        this.power=powerHealer;

    }
    @Override
    public void attack(Ennemy ennemy) {

    }
}
