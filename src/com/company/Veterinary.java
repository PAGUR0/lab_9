package com.company;

public class Veterinary {
    static void treatAnimal(Animal animal){
        System.out.println(animal.kind + " по имени " + animal.name + " ест " + animal.food + " и проживает " + animal.location);
    }
}
