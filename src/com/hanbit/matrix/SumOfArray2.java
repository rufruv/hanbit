package com.hanbit.matrix;

import java.util.Scanner;

public class SumOfArray2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int i=0, sum=0;
		System.out.println("덧셈하려는 숫자를 입력하세요. 단, 5개까지만 가능");
	//	int[]arr={1,2,3,4,5}; 
		int[]arr=new int[5];
	  /*arr[0]=s.nextInt();
		arr[2]=s.nextInt();
		arr[3]=s.nextInt();
		arr[4]=s.nextInt();
		arr[5]=s.nextInt();*/
		for(i=0; i<arr.length; i++ ){
			arr[i]=s.nextInt();
			sum+=arr[i];
			/*if(i<4){
				System.out.printf("%d %s", arr[i], "+" );
			} else {
				System.out.printf("%d %s", arr[i], "=");
			}*/
			//System.out.printf((i<4)?arr[i]+"+":arr[i]+"=");
			//System.out.printf((arr[i]==arr.length)?arr[i]+"=":arr[i]+"+");
		}
		System.out.printf("%d", sum);
}
}
