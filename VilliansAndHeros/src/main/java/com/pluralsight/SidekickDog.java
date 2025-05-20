package com.pluralsight;

public class SidekickDog implements Fightable{

    private String name;
    private int health;
    private int barkPower;

    public SidekickDog(String name, int health, int barkPower) {
        this.name = name;
        this.health = health;
        this.barkPower = barkPower;
    }

    // other methods
    public boolean isAlive() {
        return health > 0;
    }

    public String getStatus() {
        return this.name + " has " + this.health + " health left!";
    }

    // interface method
    @Override
    public void fight(SuperPerson opponent) {

        System.out.println("Sidekick " + this.name + " joins the fight!");
        opponent.takeDamage(barkPower);
    }

    // getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getBarkPower() {
        return barkPower;
    }

    public void setBarkPower(int barkPower) {
        this.barkPower = barkPower;
    }
}
