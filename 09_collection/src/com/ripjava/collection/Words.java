package com.ripjava.collection;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Words {
	public static void main(String[] args) {
        Set words = new HashSet();
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入英文单词, 空格分割：");
        String line = scanner.nextLine();
        String[] tokens = line.split(" ");
        for(String token : tokens) {
            words.add(token);
        }
        System.out.printf("不重复的单词有 %d 和：%s%n",
                words.size(), words);
    }
}
