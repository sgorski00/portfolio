package com.learning;

public class Cat extends BasicInfo implements Teresstial, Animal{
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

    public Cat(Cat cat){
        name = cat.name;
        age = cat.age;
    }
}
