package com.learning;

public class Dog extends Animal implements Teresstial{
    @Override
    public void makeNoise() {
        System.out.println("How How");
    }

    @Override
    public int numberOfLegs() {
        return 4;
    }

    @Override
    public boolean isDangerous() {
        return false;
    }

    public Dog(){

    }

    public Dog(String name, int age){
        super(name, age);
    }

    public Dog(Animal animal){
        name = animal.name;
        age = animal.age;
    }
}
