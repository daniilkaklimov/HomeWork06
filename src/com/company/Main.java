package com.company;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("CatCategory");
        Cat cat = new Cat("Leon", 200, false, 2);
        animal.animalInfo();
        cat.animalInfo();
        cat.catInfo();

        Animal Animal = new Animal("DogCategory");
        Dog dog = new Dog("Tima", 500, true, 1);
        animal.animalInfo();
        dog.animalInfo();
        dog.dogInfo();
    }
}