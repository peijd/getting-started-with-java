package com.ripjava.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Average2 {

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            double sum = 0;
            int count = 0;
            int number;
            while (true) {
                number = scanner.nextInt();
                if (number == 0) {
                    break;
                }
                sum += number;
                count++;
            }
            System.out.printf("平均 %.2f%n", sum / count);
            scanner.close();
        } catch (InputMismatchException ex) {
            System.out.println("请输入整数");
        } 
        
    }
}
