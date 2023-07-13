package com.learning;

public class Dolphin extends Animal implements Aquantis {
    @Override
    public void makeNoise() {
        System.out.println("dziudziu");
    }

    @Override
    public void howDeepIsLiving() {
        System.out.println("60 meters below sea level");
    }

    public Dolphin(){

    }

    public Dolphin(String name, int age){
        super(name, age);
    }

    public Dolphin(Animal animal){
        age = animal.age;
        name = animal.name;
    }

}
