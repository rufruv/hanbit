package com.hanbit.math;

import java.util.Scanner;

/**
 * @FILE : FindTheSumOfMulti5.java
 * @DATE : 2016. 12. 27.
 * @AUTHOR: Jon, Yooheon
 * @STORY : [Console] Integer From 1 To [input]값 The Number of Multi 5: The Sum
 *        ※ If input less than 4, please input again! 
 *        ※ If you want to stop, Enter -1
 * 
 */
public class FindTheSumOfMulti5 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int target = 0;
		int count = 0;
		int sum = 0;
		int i = 0;
		while (true) {
			System.out.println("Enter Integer");
			target = s.nextInt();
			if (target < 5) {
				/*if (target == 1) {
					System.out.println("Bye!");
				} else {
					System.out.println("Please input again!");
				}*/
				/*String result=(target == 1)?"Bye!":"Please input again!";
				System.out.println(result);*/
				System.out.println((target==1)?"Bye!":"Please input again!");
			} else {
				for(i=1; i<=target; i++){
					if(i%5==0){
						count=target/5 ; 
						sum+=i ; 
					}
				}
				System.out.printf("Inter From 1 To 100\n"
						+ "The Number of Multi 5:%d\n"
						+ "The Sum:%d\n", target, count, sum);
			}
		}
	}
}
