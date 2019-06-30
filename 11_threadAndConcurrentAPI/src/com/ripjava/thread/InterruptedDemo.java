package com.ripjava.thread;

public class InterruptedDemo {

    public static void main(String[] args) {
        Thread thread = new Thread() {
            @Override
            public void run() {
                try {
                    Thread.sleep(99999);
                } catch (InterruptedException e) {
                    System.out.println("我醒了XD");
                }
            }
        };
        thread.start();
        thread.interrupt(); // 唤醒thread的interrupt()
    }
}
