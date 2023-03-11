package com.company;

public class Cat extends Animal {

    String breed;
    String character;

    Cat(String name, String breed, String character) {
        this.name = name;
        this.breed = breed;
        this.character = character;
        kind = "Кот";
        food = "корм";
        location = "в квартире";
    }

    @Override
    void makeNoise() {
        System.out.println("Кот по имени " + name + " мяукнул " + location);
    }

    @Override
    void eat() {
        System.out.println("Кот по имени " + name + " поел " + food);
    }
}
