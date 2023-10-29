package org.example;

public class Dog extends Animal{
    private final int DISTANCE_RUN = 500;
    private final int DISTANCE_SWIM = 10;
    private int totalRun = 0;
    private int totalSwim = 0;

    @Override
    void runing(int run) {
        totalRun += run;
        if(run > DISTANCE_RUN || totalRun > DISTANCE_RUN) System.out.println("Собака не может пробежать более " + DISTANCE_RUN + " метров");
        else System.out.println("Собака пробежала " + totalRun + " метров");

    }

    @Override
    void swiming(int swim) {
        totalSwim += swim;
        if(swim > DISTANCE_SWIM || totalSwim > DISTANCE_SWIM) System.out.println("Собака не может проплыть более " + DISTANCE_SWIM + " метров");
        else System.out.println("Собака проплыла " + totalSwim + " метров");
    }
}
