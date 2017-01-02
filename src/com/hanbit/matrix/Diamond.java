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
	int i=5, j=5, s=3, e=3, k=0;
	int[][] mtx= new int [i][j];
	for(i=1; i<=5; i++){
		for(j=s; j<=e; j++){
			k++;
			mtx[i-1][j-1]=k;
		}
		if(i>=3){
			s++;
			e--;
		} else {
			s--;
			e++;
		}
		}
	for(i=0; i<5; i++){
		System.out.println("");
		for(j=0; j<5; j++){
			System.out.printf("%d\t", mtx[i][j]);
		}
	}
	
}
}
