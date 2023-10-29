package org.example;

import org.example.model.Animal;
import org.example.model.Cat;
import org.example.model.Dog;
import org.example.model.Tiger;

public class Main {
    public static void main(String[] args) {

    Animal[] animals = new Animal[5];
    animals[0] = new Cat();
    animals[1] = new Dog();
    animals[2] = new Tiger();
    animals[3] = new Cat();
    animals[4] = new Dog();

        for (Animal an: animals) {
            an.runing(100);
            an.swiming(10);
        }
        for (Animal an: animals) {
            an.runing(100);
            an.swiming(5);
        }
        System.out.println(Cat.getCount() + " котов создано");
        System.out.println(Dog.getCount() + " собаки создано");
        System.out.println(Tiger.getCount() + " тигров создано");
    }
}