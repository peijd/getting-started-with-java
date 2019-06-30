package com.ripjava.thread;

public class TortoiseHareRace3 {
    public static void main(String[] args) {
        new TortoiseThread(10).start();
        new HareThread(10).start();
    }
}
