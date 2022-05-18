package com.rpg.rpg;

public class Healer extends Hero{
    private String name;
    private int lifePointsHealer=150;
    public Healer(String name){
        this.name=name;
        this.lifePoints=lifePointsHealer;

    }
    @Override
    public void attack(Ennemy ennemy) {

    }
}
