package com.ripjava.object.Array;

public class CopyArray {
	public static void main(String[] args) {
		int[] scores = { 88, 81, 74, 68, 78, 76, 77, 85, 95, 93 };
		int[] scores2 = new int[scores.length -1];
		
		System.arraycopy(scores, 1, scores2, 0, scores.length -1);
		
		
		scores2[0] = 99;
		
		for (int score : scores2) {
			System.out.printf("%3d", score);
		}

		System.out.println();

		

		
		for (int score : scores) {
			System.out.printf("%3d", score);
		}
	}
}
