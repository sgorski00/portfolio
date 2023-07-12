package com.learning;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Cat filemon = new Cat("Filemon", 9);
        Elephant benek = new Elephant("Benek", 21);

        List<Object> animals = new ArrayList<>();
        animals.add(filemon);
        animals.add(benek);

        int i = 0;
        while (i<animals.size()){
            System.out.println("It is " + animals.get(i).getClass().getSimpleName());
            System.out.println("Make voice!");
            
            System.out.println();
            i++;
        }
    }
}