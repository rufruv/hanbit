package com.hanbit.loop_while;
import java.util.Scanner;
public class SerieseInput {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("(if you want to stop, type -1):");
	int sum = 0;
	
	while(true){
		System.out.println("Type Number:");
		int num = s.nextInt();
		if(num==-1){break;}
		sum = sum+num;
	}
		System.out.println("총합은"+sum+"입니다.");
}
}
