package com.ripjava.object.Array;

public class Score {
    public static void main(String[] args) {
    	int[] scores = {88, 81, 74, 68, 78, 76, 77, 85, 95, 93};
    	int[] scores2 = new int[scores.length];
    	for(int i = 0; i < scores.length; i++) {
    		scores2[i] = scores[i];
    	}
    	scores[0] = 18;
    	
    	for(int i = 0; i < scores2.length; i++) {
    		System.out.printf("学⽣生分数：%d %n", scores2[i]);
    		}
    }
}
