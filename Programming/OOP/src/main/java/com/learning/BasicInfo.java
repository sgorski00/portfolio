package com.learning;

public class BasicInfo {
    protected String name;
    protected int age;

    public BasicInfo(){

    }

    public BasicInfo(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
