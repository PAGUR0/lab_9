package com.company;

abstract class Animal {
    String food;
    String location;
    String kind;
    String name;

    abstract void makeNoise();

    abstract void eat();

    void sleep() {
        System.out.println("Животное спит");
    }
}
