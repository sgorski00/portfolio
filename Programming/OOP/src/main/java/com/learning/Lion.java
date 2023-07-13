package com.learning;

public class Lion extends Animal implements Teresstial {
    @Override
    public void makeNoise() {
        System.out.println("Arrrgh");
    }

    @Override
    public int numberOfLegs() {
        return 4;
    }

    @Override
    public boolean isDangerous() {
        return true;
    }

    public Lion(){

    }

    public Lion(String name, int age){
        super(name, age);
    }

    public Lion(Animal animal){
        age = animal.age;
        name = animal.name;
    }
}
