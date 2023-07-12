package com.learning;

public class Fish extends BasicInfo implements Aquantis, Animal{
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

    public Fish(Fish fish){
        age = fish.age;
        name = fish.name;
    }
}
