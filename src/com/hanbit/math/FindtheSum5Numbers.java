package com.hanbit.math;

import java.util.Scanner;

public class FindtheSum5Numbers {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	int sum = 0, count=0, n=0;  
    while (count < 5){
		System.out.println("Enter the N!");
		n = s.nextInt();
	    sum+=n;
	    count++;
	}
	System.out.printf("%s: %d", "SUM", sum);
	
}
}
