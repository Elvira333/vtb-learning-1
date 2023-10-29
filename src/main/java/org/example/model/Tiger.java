package org.example;

public class Tiger extends Animal{
    private final int DISTANCE_RUN = 1000;
    private final int DISTANCE_SWIM = 60;
    private int totalRun = 0;
    private int totalSwim = 0;

    @Override
    void runing(int run) {
        totalRun += run;
        if(run > DISTANCE_RUN || totalRun > DISTANCE_RUN) System.out.println("Тигр не может пробежать более " + DISTANCE_RUN + " метров");
        else System.out.println("Тигр пробежал " + totalRun + " метров");
    }

    @Override
    void swiming(int swim) {
        totalSwim += swim;
        if(swim > DISTANCE_SWIM || totalSwim > DISTANCE_SWIM) System.out.println("Тигр не может проплыть более " + DISTANCE_SWIM + " метров");
        else System.out.println("Тигр проплыл " + totalSwim + " метров");
    }
}
