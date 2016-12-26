package com.hanbit.loop_for;

/**
 * @FILE : Serise1To10.java
 * @DATE : 2016. 12. 26.
 * @AUTHOR: Jon, Yooheon
 * @STORY :
 */
public class Sequence3To5 {
	public static void main(String[] args) {
		for (int i = 1; i < 10; i += 1) {
			if (i % 2 != 0) {
				System.out.print(i + ", ");
			}
		}
	}
}
