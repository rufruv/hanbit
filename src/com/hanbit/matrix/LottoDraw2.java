package com.hanbit.matrix;
/**
@FILE  : LottoDraw.java
@DATE  : 2016. 12. 27.
@AUTHOR: Yeom Hye-Seon
@STORY : 로또볼 추첨
1~45까지 랜덤숫자
볼갯수는 총 6개
이미 추첨된 숫자는 배제.
출력은 []
 */
public class LottoDraw2 {
	public static void main(String[] args) {
		int lottoNum = 0, count=0, i=0;
		int[]balls = new int[6];
		String result="";
		for(i=0; i<balls.length; i++){
			balls[i] = (int)(Math.random()*45+1);
			result+=(i<5)?balls[i]+",":balls[i];
		}
		System.out.printf("%s","["+result+"]");
	}
}