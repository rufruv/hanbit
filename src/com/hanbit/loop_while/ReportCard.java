package com.hanbit.loop_while;
import java.util.Scanner;
public class ReportCard {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("If you want to stop, Type -1");
		System.out.print("Name:");
		String name = scanner.next();
		int total = 0;
		char grade = 0;
		int count = 0;
		while (true) {
			System.out.println("Score:");
			int score = scanner.nextInt();
			if (score == -1) {break;}
			total = total + score;
			count = count + 1;
		}
		int average = total / count;
		if (average >= 90) {
			grade = 'A';
		} else if (average >= 80) {
			grade = 'B';
		} else if (average >= 70) {
			grade = 'C';
		} else {
			grade = 'D';
		}
		System.out.println("Name:" + name);
		System.out.println("Total:" + total);
		System.out.println("Average:" + average);
		System.out.println("Grade:" + grade);
	}
}