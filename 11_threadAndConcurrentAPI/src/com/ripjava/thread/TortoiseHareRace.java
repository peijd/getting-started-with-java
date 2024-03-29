package com.ripjava.thread;

public class TortoiseHareRace {
    public static void main(String[] args) throws InterruptedException {
        boolean[] flags = {true, false};
        int totalStep = 10;
        int tortoiseStep = 0;
        int hareStep = 0;
        System.out.println("比赛开始...");
        while(tortoiseStep < totalStep && hareStep < totalStep) {
            Thread.sleep(1000);
            
            tortoiseStep++;
            System.out.printf("乌龟跑了 %d 步...%n", tortoiseStep);
            
            boolean isHareSleep = flags[((int) (Math.random() * 10)) % 2];
            if(isHareSleep) {
                System.out.println("兔子睡着了zzzz");
            } else {
                hareStep += 2;
                System.out.printf("免子跑了 %d 步...%n", hareStep);
            }
        }
    }
}
