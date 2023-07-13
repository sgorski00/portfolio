package com.learning;

public class Animal implements VoiceOfAnimal{
    protected String name;
    protected int age;

    public Animal() {}

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public void makeNoise() {}

    @Override
    public void voiceOfSleep() {
        System.out.println("Grrrhrhrh");
    }
}
