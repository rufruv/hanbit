package com.hanbit.matrix;
/*
0    0    1    0    0   
0    2    3    4    0   
5    6    7    8    9   
0   10   11   12    0   
0    0   13    0    0
 * */
public class Diamond {
    public static void main(String[] args) {
        int len=5, col= len, row= len, val=0, start=0, end=0; //배열에 저장할 변수
        int[][] arr = new int[col][row];
        start=3; //열의 시작 위치
        end=3; //열의 끝 위치
        int i = 0;
        int j = 0;
        
        for(i=0; i<arr.length; i++){
        	System.out.println("");
        	for(j=0; j<arr[i].length; j++){
        		System.out.printf("[%d,%d]", i,j);
        	}
        }


    }
}