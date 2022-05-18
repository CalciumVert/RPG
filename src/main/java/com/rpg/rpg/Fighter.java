package com.rpg.rpg;

public class Fighter extends Hero{
    private String name;
    private int lifePointsFighter=100;
    public Fighter(String name){
        this.name=name;
        this.lifePoints=lifePointsFighter;

    }
    @Override
    public void attack(Ennemy ennemy) {

    }
}
