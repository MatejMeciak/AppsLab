package com.company;

public class Warrior{
    String name;
    int life;
    int speed;
    int muscle;
    Item[] items;

    public Warrior(String name, int life, int speed, int muscle, Item[] items) {
        this.name = name;
        this.life = life;
        this.speed = speed;
        this.muscle = muscle;
        this.items = items;
    }
}