package com.hanbit.matrix;

/*[0,0][0,1][0,2][0,3][0,4] 
  [1,0][1,1][1,2][1,3][1,4] 
  [2,0][2,1][2,2][2,3][2,4] 
  [3,0][3,1][3,2][3,3][3,4] 
  [4,0][4,1][4,2][4,3][4,4]*/
public class Gugudan {
	public static void main(String[] args) {
		// i * j = i*j
		int[][] mtx = new int[10][6];

		for (int i = 1; i < mtx.length; i++) {
			System.out.println("");
			for (int j = 2; j < mtx[i].length; j++) {
				System.out.printf("%dX%d=%d\t", j, i, i * j);
			}
		}
		System.out.printf("%s\n", "");

		int[][] mtx2 = new int[10][10];

		for (int i = 1; i < mtx2.length; i++) {
			System.out.println("");
			for (int j = 6; j < mtx2[i].length; j++) {
				System.out.printf("%dX%d=%d\t", j, i, i * j);
			}
		}
	}
}
