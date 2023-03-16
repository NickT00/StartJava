package com.startjava.lesson_2_3.robot;

public class Jaeger {

    private String name;
    private String origin;
    private int weight;
    private int speed;
    private int strength;
    private int health;

    public Jaeger() {
    }

    public Jaeger(String name, String origin, int weight, int speed, int strength) {
        this.name = name;
        this.origin = origin;
        this.weight = weight;
        this.speed = speed;
        this.strength = strength;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getOrigin() {
        return origin;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getStrength() {
        return strength;
    }

    public void move() {
        if(speed < 5) {
            System.out.println(name + " moving slowly");
        } else {
            System.out.println(name + " moving");
        }
    }

    public void shoot() {
        if(strength == 10) {
            System.out.println(name + " lunches a rocket");
            weight -= 3;
        } else {
            System.out.println(name + " shooting");
            weight -= 2;
        }
    }
}