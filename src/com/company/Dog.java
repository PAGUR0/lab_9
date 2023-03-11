package com.company;

class Dog extends Animal {

    String breed;
    String appointment;

    Dog(String name, String breed, String appointment) {
        this.name = name;
        this.breed = breed;
        this.appointment = appointment;
        kind = "Собака";
        food = "мясо";
        location = "во дворе";
    }

    @Override
    void makeNoise() {
        System.out.println("Собака по имени " + name + " гавкала " + location);
    }

    @Override
    void eat() {
        System.out.println("Собака по имени " + name + " поела " + food);
    }
}
