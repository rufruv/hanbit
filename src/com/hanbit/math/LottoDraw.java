package com.hanbit.math;
import java.util.Scanner;
/*
 로또볼 추첨
 1~45까지 랜덤숫자
 볼갯수는 총6개
 중복허용
 출력은 [5,23,12,40,19,22]
 */
public class LottoDraw {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	int count=0, b1=0, b2=0, b3=0, b4=0, b5=0, b6=0 ;
	//System.out.println("Ball Number:"+ number);
	while(count<6){
		if(count==0){
			b1 = (int) (Math.random()*45+1);
		} else if(count==1){
			b2 = (int) (Math.random()*45+1);
		} else if(count==2){
			b3 = (int) (Math.random()*45+1);
		} else if(count==3){
			b4 = (int) (Math.random()*45+1);
		} else if(count==4){
			b5 = (int) (Math.random()*45+1);
		} else{
			b6 = (int) (Math.random()*45+1);
		}
		count++;
	}
	System.out.println(b1+","+b2+","+b3+","+b4+","+b5+","+b6);
}
}
