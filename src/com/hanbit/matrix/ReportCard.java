package com.hanbit.matrix;
import java.util.Scanner;
public class ReportCard {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("If you want to stop, Type -1");
		System.out.println("If the number of Subject is 6, Auto quit!");
		System.out.print("Name:");
		String name = s.next();
		int total = 0, average = 0, i = 0 ;
		char grade = 0;
		int[]score = new int[5]; 
		for(i=0; i<score.length; i++){
			System.out.printf("%s", "Score:");
			score[i]=s.nextInt();
			total+=score[i];
		}
		average = total / score.length;
		if (average >= 90) {
			grade = 'A';
		} else if (average >= 80) {
			grade = 'B';
		} else if (average >= 70) {
			grade = 'C';
		} else {
			grade = 'D';
		}
		System.out.println("Total:"+total);
		System.out.println("Average:"+average);
		System.out.println("Grade:"+grade);
		System.out.printf(
				"========================================\n"+
		        "이름     국어  영어  수학  사회  과학  평균  학점\n"+
				"----------------------------------------\n"+
		        "홍길동   70   70   70   70   70   70   C  \n"+
				"========================================\n");

}
}