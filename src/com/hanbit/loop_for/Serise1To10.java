package com.hanbit.loop_for;

/**
 * @FILE : Serise1To10.java
 * @DATE : 2016. 12. 26.
 * @AUTHOR: Jon, Yooheon
 * @STORY :
 */
public class Serise1To10 {
	public static void main(String[] args) {
		int sum = 0;
		for (int num = 0; num <= 10; num++) {
			//System.out.println("NUM:" + num);
			sum += num;
		}
		System.out.println("SUM:" + sum);
	}
}
