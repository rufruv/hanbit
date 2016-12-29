package com.hanbit.matrix;
import java.util.Scanner;
public class ReportCard2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("If you want to stop, Type -1");
		System.out.println("If the number of Subject is 6, Auto quit!");
		System.out.print("Name:");
		String name = s.next();
		int total = 0, average = 0, i = 0 ;
		char grade = 0;
		String subString = "=========================================================\n";
		String[]sub = {"이름", "국어", "영어", "수학", "사회", "과학", "평균","학점"};
		int[]score = new int[5];
		
		for(i=0; i<sub.length; i++){
			subString+=sub[i]+"\t";
		}
		
		subString+="\n---------------------------------------------------\n"+name+"\t";
		String temp="  ";
		for(i=0; i<score.length; i++){
			System.out.printf("%s", "Score:");
			score[i]=s.nextInt();
			total+=score[i];
			if(score[i]>100 || score[i]<0){
				System.out.println("다시입력하세요:");
				i=i-1;
			}
			temp+=score[i]+"\t";
		}
		subString+=temp;
		
		average = total / score.length;
		int sw = average/10; 
		switch(sw){
			case 9: grade = 'A'; break;
			case 8: grade = 'B'; break;
			case 7: grade = 'C'; break;
			default: grade = 'D'; break;
		}
		
		subString+=(average+"\t"+grade);
		subString+="\n====================";
		System.out.printf("%s", subString);
	}
}

