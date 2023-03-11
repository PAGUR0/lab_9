package com.company;

class Horse extends Animal {

    String color;
    int speed;

    Horse(String name, String color, int speed) {
        this.name = name;
        this.color = color;
        this.speed = speed;
        kind = "Лошадь";
        food = "травы";
        location = "на лугу";
    }

    @Override
    void makeNoise() {
        System.out.println("Лошадь по имени " + name + " ржала " + location);
    }

    @Override
    void eat() {
        System.out.println("Лошадь по имени " + name + " поела " + food);
    }
}
