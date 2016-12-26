package com.hanbit.loop_for;

public class Fibobacci {
public static void main(String[] args) {
	int a = 1, b=1, c=2, sum=0 ; 
	for(int i=3; i<11; ){
		c = a+b;
	}
	System.out.printf(
	                  "=====================================\n"
		            + "1, 1, 2, 3, 5, 8, 13, 21, 34, 55의 합 \n" 
	                + "-------------------------------------\n"
                    + "%d \n"
	                + "=====================================", sum);
}
}
