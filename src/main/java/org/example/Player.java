package org.example;

public class Player {
    private int health;
    private int strength;
    private int lives;
    private boolean isAlive;

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getLives() {
        return lives;
    }

    public void setLives(int lives) {
        this.lives = lives;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }

    public Player(int health, int strength, int lives, boolean isAlive) {
        this.health = health;
        this.strength = strength;
        this.lives = lives;
        this.isAlive = isAlive;
    }
    public void ifDead(){
        if(lives <= 0){
            System.out.println("Game Over");
        }


    }

    public void loseLive() {
        if( health <= 0){
            lives -= 1;
            health = 100;
        }

    }

    public static void attack(Player attacker, Player attacked){
        attacked.setHealth(attacked.getHealth() - attacker.getStrength());
    }
}
