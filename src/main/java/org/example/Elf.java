package org.example;

public class Elf extends Player{
    public Elf(int health, int strength, int lives, boolean isAlive) {
        super(health, strength, lives, isAlive);
    }
    public void elfEvade(){
        setHealth(getLives() + 10);
    }
}
