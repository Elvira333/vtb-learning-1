package org.example;

public class Cat extends Animal{
    private final int DISTANCE_RUN = 200;
    private int totalRun = 0;

    @Override
    void runing(int run) {
        totalRun += run;
        if(run > DISTANCE_RUN || totalRun > DISTANCE_RUN) System.out.println("Кот не может бежать более " + DISTANCE_RUN + " метров");
        else {
            System.out.println("Кот пробежал " + totalRun + " м");
        }

    }

    @Override
    void swiming(int swim) {
        System.out.println("Кот не умеет плавать!");
    }
}
