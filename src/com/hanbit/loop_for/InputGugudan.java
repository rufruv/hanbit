package com.hanbit.loop_for;

import java.util.Scanner;

public class InputGugudan {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		while (true) {
			System.out.println("출력할 단을 입력하세요");
			int num = s.nextInt();
			if (num > 0 && num < 10) {
				for (int i = 1; i < 10; i++) {
					System.out.println(num + "*" + i + "=" + num * i);
				}
			} else {
				System.out.println("(1에서 9까지의 수를 입력해주세요!)");
			}
		}
	}
}
