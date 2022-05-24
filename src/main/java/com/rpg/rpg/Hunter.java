package com.rpg.rpg;

public class Hunter extends Hero{
    private String name;
    private int lifePointsHunter=80;
    public Hunter(String name){
        this.name=name;
        this.lifePoints=lifePointsHunter;

    }
    @Override
    public void attack(Ennemy ennemy) {

    }
}
