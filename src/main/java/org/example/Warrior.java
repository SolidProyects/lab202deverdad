package org.example;

public class Warrior extends Player {
    public Warrior(int health, int strength, int lives, boolean isAlive) {
        super(health, strength, lives, isAlive);
    }
    public void warriorHit(){
        setStrength(getStrength() + 10);
    }
}
