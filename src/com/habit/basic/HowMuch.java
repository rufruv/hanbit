package com.habit.basic;

import java.util.Scanner;

public class HowMuch {
	public static void main(String[] args) {
		// variable Declation
		Scanner scanner = new Scanner(System.in);
		int price=0, count=0, total=0, rate=0, dc=0; 
		// Value Assignment
		System.out.println("얼마에요?");
		// System.out.println("%s\n", "얼마에요?");
		price = scanner.nextInt();
		System.out.println(price + "원 입니다."); 
		// System.out.println("%d 원입니다.\n",price);
		System.out.println("몇개 드릴까요?");
		// System.out.println("%s\n", "몇개 드릴까요?");
		count = scanner.nextInt();
		System.out.println(count + "개 주세요.");
		// System.out.println("%d개 주세요\n", count);
		total = price * count;
		System.out.println("총금액" + total + "원 입니다.");
		// System.out.println("총 금액은 %d 원 입니다\n", total);
		System.out.println("비싸네.. 깍아주세요.");
		System.out.println("얼마나 깍아드릴까요?");
		rate = scanner.nextInt();
		System.out.println(rate + "% 깍아주세요.");
		//System.out.println("");
		
		// Operation
		if (rate > 10) {
			System.out.println("안팔아요.");
		} else {
			dc = total - total * rate / 100;
			System.out.println(dc + "원 입니다.");
			// System.out.println("%d%s", dc, "원입니다");
		}
	}
}