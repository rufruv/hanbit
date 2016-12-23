package com.hanbit.branch_switch;

import java.util.Scanner;

public class Snn {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("주민번호:");
		String ssn = scanner.next();
		char ch = ssn.charAt(7);

		if (ch == '0' || ch == '7' || ch == '8' || ch == '9') {
			System.out.println("다시 입력하세요");
			return;
		}

		System.out.println("이름:");
		String name = scanner.next();
		String gender = "";
		
		if (ch == '1' || ch == '3') {
			gender = "남자";
		} else if (ch == '2' || ch == '4') {
			gender = "여자";
		} else {
			gender = "외국인";
		}
		System.out.println(name + ":" + ssn + ":" + gender);
	}
}
