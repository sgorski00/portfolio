package com.learning;

public class Dog extends BasicInfo implements Animal, Teresstial{
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

    public Dog(Dog dog){
        name = dog.name;
        age = dog.age;
    }
}
