package com.hanbit.matrix;
import java.util.Scanner;
public class ReportCard {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String name="";
		int[]score=new int[5];
		String[]sub={"이름","국어","영어","수학","사회","과학","평균","학점"};
		String subStr="",scoreStr="";
		int total=0, average=0, i=0;
		char grade=0;
		System.out.printf("Name:");
		name=s.next();
		for(i=0;i<sub.length;i++){
			subStr+=sub[i]+"\t";
		}
		for(i=0;i<score.length;i++){
			System.out.printf("Score:");
			score[i]=s.nextInt();			
			if(score[i]<0||score[i]>100){
				System.out.println("점수범위를 넘습니다. 다시 입력하세요.");
				i--;
			}else{
				total+=score[i];
				scoreStr+=score[i]+"\t";
			}
		}
		average=total/score.length;
		
		switch(average/10){
		case 10:case 9:
			grade='A'; break;
		case 8:
			grade='B'; break;
		case 7:
			grade='C'; break;
		default:
			grade='D'; break;
		}
		System.out.printf("============================================================\n"
				        + "%s\n"
				        + "------------------------------------------------------------\n"
				        + "%s\t%s%d\t %c\n"
				        + "============================================================\n"
				          ,subStr,name,scoreStr,average,grade);
	}
}