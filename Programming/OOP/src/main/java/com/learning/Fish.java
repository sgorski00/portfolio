package com.learning;

public class Fish extends Animal implements Aquantis {
    @Override
    public void makeNoise() {
        System.out.println("gul gul");
    }

    @Override
    public void howDeepIsLiving() {
        System.out.println("200 meters below sea level");
    }

    public Fish() {}

    public Fish(String name, int age){
        super(name, age);
    }

    public Fish(Animal animal){
        age = animal.age;
        name = animal.name;
    }
}
