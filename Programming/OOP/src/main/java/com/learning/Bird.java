package com.learning;

public class Bird extends Animal implements Aerial {
    @Override
    public void makeNoise() {
        System.out.println("Kraaa");
    }

    @Override
    public void howHighFly() {
        System.out.println("3000 meters");
    }

    public Bird(){

    }

    public Bird(String name, int age){
        super(name, age);
    }

    public Bird(Animal animal){
        age = animal.age;
        name = animal.name;
    }
}
