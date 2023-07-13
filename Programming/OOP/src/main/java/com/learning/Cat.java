package com.learning;

public class Cat extends Animal implements Teresstial {
    @Override
    public void makeNoise() {
        System.out.println("Meow");
    }

    @Override
    public int numberOfLegs() {
        return 4;
    }

    @Override
    public boolean isDangerous() {
        return false;
    }

    public Cat(){

    }

    public Cat(String name, int age){
        super(name, age);
    }

    public Cat(Animal animal){
        name = animal.name;
        age = animal.age;
    }
}
