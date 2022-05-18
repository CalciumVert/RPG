package com.rpg.rpg;

public class Mage extends Hero{
    private String name;
    private int lifePointsMage=70;
    public Mage(String name){
        this.name=name;
        this.lifePoints=lifePointsMage;

    }
    @Override
    public void attack(Ennemy ennemy) {

    }
}
