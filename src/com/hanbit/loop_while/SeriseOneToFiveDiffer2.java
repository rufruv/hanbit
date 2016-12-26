package com.hanbit.loop_while;

/**
@FILE  : SeriesOneToFive.java
@DATE  : 2016. 12. 23.
@AUTHOR: Jon, Yooheon
@STORY :
1부터 5까지의 합 구하기(diff=2)
*/
public class SeriseOneToFiveDiffer2 {
public static void main(String[] args) {
	int sum = 0;
	int num = 1;
	while(num<=20){
		//System.out.println("Number:"+num);
		sum+=num;
		//sum=sum+num;
		num+=2;
		//num=num+3;
	}
	System.out.println("SUM;"+sum);	
}
}
