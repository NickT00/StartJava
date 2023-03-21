package com.startjava.lesson_2_3_4.animal;

public class WolfTest {

    public static void main(String[] args) {
        Wolf wolfOne = new Wolf();
        wolfOne.setSex("Boy");
        wolfOne.setNickname("Wolfy");
        wolfOne.setWeight(30);
        wolfOne.setAge(7);
        wolfOne.setColor("Gray");
        System.out.println("Sex - " + wolfOne.getSex() + "\nNickname - " + wolfOne.getNickname() 
                + "\nWeight - " + wolfOne.getWeight() + "\nAge - " + wolfOne.getAge() 
                + "\nColor - " + wolfOne.getColor());
        wolfOne.move();
        wolfOne.sit();
        wolfOne.run();
        wolfOne.howl();
        wolfOne.hunt();
    }
}