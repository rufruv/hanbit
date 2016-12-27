package com.hanbit.series;

import java.util.Scanner;

public class Fibonacci {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	int a = 1, b=1, c=2, sum= 2; 
	System.out.println("Enter the last index of Term"
			+ "(Start of index is 1)");
	int last = s.nextInt();
	for(int i=3; i<=last; i++){
		c = a+b;
		a = b;
		b = c;
		sum+=c;
	}
	System.out.printf(
	                  "=====================================\n"
		            + "1, 1, 2, 3, 5, 8, 13, 21, 34, 55의 합 \n" 
	                + "-------------------------------------\n"
                    + "%d\n"
	                + "=====================================", sum);
}
}
