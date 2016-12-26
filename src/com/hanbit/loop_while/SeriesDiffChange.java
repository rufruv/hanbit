package com.hanbit.loop_while;

public class SeriesDiffChange {
	public static void main(String[] args) {
		int i = 0, d = 1, sum = 1;

		while (true) {
            i++;
            d+=i;
            sum+=d;
			if (i == 19) {break;}
			
		}
		System.out.printf("===============================================\n"
				        + "1+2+4+7+11+16+... 증가하는 수열의 20번째 항까지 합 \n" 
				        + "-----------------------------------------------\n"
				        + "%d \n"
				        + "===============================================\n", 
				        sum);
	}
}
