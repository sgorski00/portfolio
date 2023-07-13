package com.learning;

public class Elephant extends Animal implements Teresstial {
    @Override
    public void makeNoise() {
        System.out.println("Fiuuuu");
    }

    @Override
    public int numberOfLegs() {
        return 4;
    }

    @Override
    public boolean isDangerous() {
        return false;
    }

    public Elephant(){

    }

    public Elephant(String name, int age){
        super(name, age);
    }

    public Elephant(Animal animal){
        name = animal.name;
        age = animal.age;
    }
}
