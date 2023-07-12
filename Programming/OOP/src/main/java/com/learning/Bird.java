package com.learning;

public class Bird extends BasicInfo implements Aerial, Animal{
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

    public Bird(Bird bird){
        age = bird.age;
        name = bird.name;
    }
}
