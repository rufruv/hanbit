package com.hanbit.branch_if;

import java.util.Scanner;

public class ReportCard {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	    
		System.out.print("Name:");
		String name = scanner.next();
        
		System.out.println("Koean Score:");
		int korea = scanner.nextInt();
		System.out.println("English Score:");
		int english = scanner.nextInt();
		System.out.println("Math Score:");
		int math = scanner.nextInt();
        int total = korea + english + math;
		int average = total / 3;
		char grade = 0;
		
		if(average>=90){
			grade = 'A';
		}else if(average>=80){
			grade = 'B';
		}else if(average>=70){
			grade = 'C';
		}else{
			grade = 'D';
		}
		
		System.out.println("Name:" + name);
		System.out.println("Total:" + total);
		System.out.println("Average:" + average);
		System.out.println("Grade:" + grade);
	}
}