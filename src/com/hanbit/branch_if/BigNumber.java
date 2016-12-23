package com.hanbit.branch_if;

/*
가장 큰 값부터 작은 순으로 나열하는 statement 를 완성하시오
예를 들어, a=4, b=7, c=1 을 입력했다면.. 7,4,1 이 되겠습니다
**/
import java.util.Scanner;

public class BigNumber {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("A 값을 입력하세요.");
		int a = scan.nextInt();
		System.out.println("B 값을 입력하세요");
		int b = scan.nextInt();
		System.out.println("C 값을 입력하세요");
		int c = scan.nextInt();

		if (a > b && a > c) {
			if (b > c) {
				System.out.println(a + "->" + b + "->" + c);
			} else {
				System.out.println(a + "->" + c + "->" + b);
			}
		} else if (b > a && b > c) {
			if (a > c) {
				System.out.println(b + "->" + a + "->" + c);
			} else {
				System.out.println(b + "->" + c + "->" + a);
			}
			
		} else if (c > a && c > b) {
			if (a > b) {
				System.out.println(c + "->" + a + "->" + b);
			} else {
				System.out.println(c + "->" + b + "->" + a);
			}
		}
	}
}