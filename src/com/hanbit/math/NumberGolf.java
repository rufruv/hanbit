package com.hanbit.math;

import java.util.Scanner;

/**
@FILE  : NumberGolf.java
@DATE  : 2016. 12. 27.
@AUTHOR: Jon, Yooheon
@STORY :  최단횟수로 맞추는 사람이 승리하는 게임
-1 stop
you can Integer 1~100
*/
public class NumberGolf {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int target = (int) (Math.random()*100+1);
		int bet = 0;
		int count = 0;
		System.out.println("Target:"+target);
		while(true){
			System.out.println("Enter Integer(1~100)");
			bet = s.nextInt();
			if(bet==target){
				System.out.println("정답!");
			} else {
				System.out.println((bet<target)?"더 큰값을 입력하세요":"더 적은값을 입력하세요");
			}
		}
			
		
	}

}
