package com.hanbit.matrix;

import java.util.Scanner;

public class SumOfArray {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("덧셈하려는 숫자를 입력하세요. 단, 5개까지만 가능");
		int[]arr={1,2,3,4,5}; 
		int sum=0;
		for(int i=0; i<arr.length; i++ ){
			sum+=arr[i];
			/*if(i<4){
				System.out.printf("%d %s", arr[i], "+" );
			} else {
				System.out.printf("%d %s", arr[i], "=");
			}*/
			System.out.printf((i<4)?arr[i]+"+":arr[i]+"=");
			//System.out.printf((arr[i]==arr.length)?arr[i]+"=":arr[i]+"+");
		}
		System.out.printf("%d", sum);
}
}
