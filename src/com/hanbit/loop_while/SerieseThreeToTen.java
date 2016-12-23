package com.hanbit.loop_while;

public class SerieseThreeToTen {
public static void main(String[] args) {
	int sum = 0;
	int num = 3;
	while(true){
		sum = sum + num;
		if(num==10){break;}
		num = num + 1;
	}
	System.out.println("합은"+sum+"입니다.");
}
}

