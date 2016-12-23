package com.hanbit.branch_if;

import java.util.Scanner;

public class Snn {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("주민번호:");
		String ssn = scanner.next();
		char ch = ssn.charAt(7);

		String gender = "";
		
		switch(ch){
		    case  '1': case  '3':
				gender = "남자"; break;
            case  '2': case  '4':
				gender = "여자"; break;
			case  '5': case  '6':
				gender = "외국인"; break;
			default :
				System.out.println("다시 입력하세요");
				return;
		}
		System.out.println(ssn + ":" + gender);
	}
}
