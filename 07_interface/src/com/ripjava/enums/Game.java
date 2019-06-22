package com.ripjava.enums;

public class Game {
    public static void play(Action action) {
        switch(action) {
            case STOP:
                System.out.println("停止");
                break;
            case RIGHT:
                System.out.println("向右");
                break;
            case LEFT:
                System.out.println("向左");
                break;
            case UP:
                System.out.println("向上");
                break;
            case DOWN:
                System.out.println("向下");
                break;
        }
    }
    public static void main(String[] args) {
        play(Action.RIGHT);
        play(Action.UP);
    }    
}
