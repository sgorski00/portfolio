package com.learning;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Animal filemon = new Cat("Filemon", 9);
        Animal benek = new Elephant("Benek", 21);
        Animal axel = new Dog("Axel", 5);
        Animal max = new Dog("Max", 4);
        Animal max2 = new Elephant(max);
        Animal ricci = new Lion("Ricci", 23);

        List<Animal> animals = new ArrayList<>();
        animals.add(filemon);
        animals.add(benek);
        animals.add(axel);
        animals.add(max);
        animals.add(max2);

        int i = 0;
        while (i< animals.size()){
            System.out.print("It is " + animals.get(i).getClass().getSimpleName());
            System.out.print(". His name is " + animals.get(i).name);
            System.out.println(". He is " + animals.get(i).age + " years old.");
            System.out.println(animals.get(i).name + " make voice!");
            animals.get(i).makeNoise();

            System.out.println();
            i++;
        }
    }
}