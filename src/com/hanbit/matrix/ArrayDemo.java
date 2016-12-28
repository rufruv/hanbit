package com.hanbit.matrix;

public class ArrayDemo {
	public static void main(String[] args) {
		int[]a={105,200,67,9,11}; //String[]a={"daddy","mom"}
		System.out.printf("Array length:%d\n",a.length);
		System.out.printf("Array 3번째값:%d\n",a[2]);
		for(int i=0; i<a.length; i++){
			System.out.printf("%d\t",a[i]);  // "%s",a[i]
		}
	}
}
