package org.example;

public class Wizard extends Player{
    public Wizard(int health, int strength, int lives, boolean isAlive) {
        super(health, strength, lives, isAlive);
    }
    public void WizardCast(){
        setLives(getLives() + 1);
    }
}
