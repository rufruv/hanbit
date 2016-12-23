package com.hanbit.branch_switch;
import java.util.Scanner;
/**
@FILE  : ShowMonth.java
@DATE  : 2016. 12. 23.
@AUTHOR: Jon, Yooheon
@STORY :
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
			if (year % 400 == 0) {
				day = "29";
			} else if (year % 100 == 0) {
				day = "28";
			} else if (year % 4 == 0) {
				day = "29";
			} else {
				day = "28";
			}
			break;
		}
		System.out.println(year + "년" + month + "월은" + day + "입니다.");
	}
}
