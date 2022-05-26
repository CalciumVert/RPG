package com.rpg.rpg;

public class Hunter extends Hero{
    private String name;
    private int lifePointsHunter=80;
    private int powerHunter=130;

    public Hunter(String name){
        this.name=name;
        this.lifePoints=lifePointsHunter;
        this.power=powerHunter;

    }
    @Override
    public void attack(Ennemy ennemy) {

    }
}
