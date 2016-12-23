package com.hanbit.branch_if;

import java.util.Scanner;

/*
To.개발자님께
초단위로 알려주는 시험이 있는데
이 값을 몇시간 몇분 몇초인지 계속 계산해야 해서요.
혹시 초값을 입력받으면 자동으로 계산되는 프로그램을
만들어 줄 수 있을까요?
그러니까 500초 이면 뭐 몇시간 몇분 몇초라고 보여주면 좋겠죠.l
*/
public class TimeCalc {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("초를 시간과 분으로 바꾸어주는 프로그램입니다.");
		System.out.println("초를 입력해주세요.");
		int time = scanner.nextInt();

		int second = time % 60;
		int minute = time / 60 % 60;
		int hour = time / 60 / 60;

		if (time >= 3600) {
			System.out.println(hour + "시간" + minute + "분" + second + "초");
		} else if (time >= 60) {
			System.out.println(minute + "분" + second + "초");
		} else {
			System.out.println(second + "초");
		}
	}

}
