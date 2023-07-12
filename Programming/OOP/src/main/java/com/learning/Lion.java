package com.learning;

public class Lion extends BasicInfo implements Teresstial, Animal{
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

    public Lion(Lion lion){
        age = lion.age;
        name = lion.name;
    }
}
