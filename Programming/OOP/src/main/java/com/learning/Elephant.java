package com.learning;

public class Elephant extends BasicInfo implements Teresstial, Animal{
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

    @Override
    public String getName(){
        return name;
    }

    public Elephant(){

    }

    public Elephant(String name, int age){
        super(name, age);
    }

    public Elephant(Elephant elephant){
        name = elephant.name;
        age = elephant.age;
    }
}
