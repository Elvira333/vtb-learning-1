package org.example;

public class Animal {
    private int run;
    private int swim;

    public Animal(int run, int swim) {
        this.run = run;
        this.swim = swim;
    }

    void runing(int run){
        run = this.run;
        System.out.println(run + "км пробежал");

    }

    void swiming(int swim){
        swim = this.swim;
        System.out.println(swim + "км проплыл");
    }
    public Animal() {
    }

    public int getRun() {
        return run;
    }

    public void setRun(int run) {
        this.run = run;
    }

    public int getSwim() {
        return swim;
    }

    public void setSwim(int swim) {
        this.swim = swim;
    }
}
