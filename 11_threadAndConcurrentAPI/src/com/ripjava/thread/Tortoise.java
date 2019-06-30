package com.ripjava.thread;

public class Tortoise implements Runnable {
    private int totalStep;
    private int step;
    
    public Tortoise(int totalStep) {
        this.totalStep = totalStep;
    }
    
    @Override
    public void run() {
        try {
            while(step < totalStep) {
                Thread.sleep(1000);
                step++;
                System.out.printf("乌龟跑了 %d 步...%n", step);
            }
        } catch(InterruptedException ex) {
            throw new RuntimeException(ex);
        }
    }
}
