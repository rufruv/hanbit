package com.hanbit.branch_switch;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("=== Calculator ===");
		System.out.println("First Number:");
		int a = s.nextInt();
		System.out.println("Opcode:");
		String opcode = ""; // 외부에서 값을 입력받는 식
		opcode = s.next();
		// String opcode = s.next(); 
		
		// opcode.equals("+")){
		// a + b
		// }

		System.out.println("Second Number:");
		int b = s.nextInt();

		// int result = 0;
		
		int result = 0;

		switch(opcode){
		case "+":
			result = a + b;
			break;
		case "-":
			result = a - b;
			return;
		case "*":
			result = a * b;
			break;
		case "/":
			result = a / b;
			break;
		case "%":
			result = a % b;
			break;
		default :
		    System.out.println("다시 입력하세요!");
		    return;
		}
		System.out.println("Result:" + result);

	}
}