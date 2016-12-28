package com.hanbit.matrix;
import java.util.Scanner;

public class Money {
/**
 * 금액을 입력받은 후 우리나라 화폐종류별로 해당 갯수를 표기하는 프로그램
 * [요구사항] 금융업을 하는 고객사로부터 프로그램 개발요청이 들어왔습니다.
 * 금액을 입력받은 후 우리나라 화폐종류별로 해당 갯수를 표기하는 프로그램입니다.
 * 예를들어, 125,520 원을 입력하면 화면에 이렇게 보이게 하면 됩니다.
 * 표시하고 10원미만은 절삭
   ******************************************************
     요청금액 : 126,520 원
   5만원 : 2매
   1만원 : 2매
   5천원 : 1매
   1천원 : 1매
   5백원 : 1개 
     백t원 : 0개
     오십원 : 0개
     십원 : 2개
   ********************************************************
 * */
      public static void main(String[] args) {

        System. out.println( "금액을 입력하세요" );

        Scanner s = new Scanner(System. in);

        int money = s.nextInt();

        int[] moneyUnit = { 50000, 10000, 5000, 1000, 500, 100, 50, 10 };

        int mok = 0;

        int nmg = 0;

        System. out.println( "Money:" + money);

        for (int i = 0; i < moneyUnit.length; i++) {

             // 이 부분을 코딩하여 완성하시오

        }

    }
}