package com.hanbit.branch_if;

import java.util.Scanner;

public class BMI {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Age:");
		int age = scanner.nextInt();

		if (age < 2) {
			System.out.println("BMI 지수의 참고치 정보는 2세 이상부터 제공됩니다." + "정확한 정보를 입력하세요.");
			return;
		}
		System.out.println("Weight:");
		double weight = scanner.nextDouble();
		System.out.println("Height:");
		double height = scanner.nextDouble() / 100;

		double bmi = weight / (height * height);
		String grade = ""; 
		//String grade = new String();

		if (bmi > 30.0) {
			grade = "고도비만";
		} else if (bmi > 25.0) {
			grade = "비만";
		} else if (bmi > 23.0) {
			grade = "과체중";
		} else if (bmi > 18.5) {
			grade = "정상";
		} else {
			grade = "저체중";
		}
		System.out.println("BMI:" + grade);
	}
}