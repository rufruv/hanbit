package com.hanbit.loop_for;

/**
 * @FILE : SeriesOneToFive.java
 * @DATE : 2016. 12. 23.
 * @AUTHOR: Jon, Yooheon
 * @STORY : 1부터 5까지의 합 구하기(diff=1)
 */
public class Unary {
	public static void main(String[] args) {
		int sum = 0;
		/*int num = 0;
		while (num < 5) {
			num++;
			System.out.println("NUM:" + num);
			sum += num;
		}*/
		for(int num = 0; num < 5; num++ ){
			System.out.println("NUM:" + num);
			sum += num;
		}
		System.out.println("SUM;" + sum);
	}
}
