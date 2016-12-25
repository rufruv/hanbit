package com.habit.basic;

import java.util.Scanner;

public class HowMuch2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("얼마에요?");
	    int price = scanner.nextInt();
		System.out.print(price + "달러 입니다.");
		System.out.print("몇개 드릴까요?");
		int count = scanner.nextInt();
		System.out.print(scanner.next() + "개 주세요.");
		int total = price * count;
		System.out.print("총 금액은" +total+ "입니다");
	}
}