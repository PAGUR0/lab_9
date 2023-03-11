package com.company;


public class Main {

    public static void main(String[] args) {
        Animal Murzik = new Cat("Мурзик", "Британский вислоухий", "Ласковый");
        Dog Scharik = new Dog("Шарик", "Дворняга", "Сторожевой");
        Horse Angel = new Horse("Ангел", "Гнедой", 30);
        Murzik.makeNoise();
        Murzik.eat();
        Murzik.sleep();
        Scharik.makeNoise();
        Scharik.eat();
        Scharik.sleep();
        Angel.makeNoise();
        Angel.eat();
        Angel.sleep();
        Veterinary.treatAnimal(Murzik);
        Veterinary.treatAnimal(Scharik);
        Veterinary.treatAnimal(Angel);
    }
}
