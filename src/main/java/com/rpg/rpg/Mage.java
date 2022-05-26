package com.rpg.rpg;

public class Mage extends Hero{
    private String name;
    private int lifePointsMage=70;
    private int powerMage=150;
    public Mage(String name){
        this.name=name;
        this.lifePoints=lifePointsMage;
        this.power=powerMage;

    }
    @Override
    public void attack(Ennemy ennemy) {

    }
}
