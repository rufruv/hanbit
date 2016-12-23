package com.hanbit.branch_switch;

import java.util.Scanner;

/**
 * @FILE : ShowMonth.java
 * @DATE : 2016. 12. 23.
 * @AUTHOR: Jon, Yooheon
 * @STORY : 
   [1]연도를 4로 나눈값이 0이고, 
         해당 연수가 100으로 나누어 떨어지지 않으면 윤년이다. 
   [2]연도를 4로 나눈값이 0이고, 
         해당 연수가 100으로 나누어 떨어지는데 400으로 떨어지면 윤년.
 */
public class ShowMonth {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int year = 0, month = 0;
		String day = "";
		System.out.println("Year");
		year = s.nextInt();
		System.out.println("Month");
		month = s.nextInt();

		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			day = "31";
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			day = "30";
			break;
		case 2:
			if (year % 4 == 0 && year % 100 != 0) {
				day = "29";
			} else if (year % 400 == 0) {
				day = "29";
			} else {
				day = "28";
			}
			break;
		default:
			System.out.println("틀렸습니다. 다시 입력하세요");
			return;
		}
		System.out.println(year + "년" + month + "월은" + day + "입니다.");
	}
}
