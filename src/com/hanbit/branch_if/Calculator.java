package com.hanbit.branch_if;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = 0, b = 0, result = 0;

		System.out.println("=== Calculator ===");
		System.out.println("First Number:");
		a = s.nextInt();
		System.out.println("Opcode:");
		String opcode = ""; // 외부에서 값을 입력받는 식
		opcode = s.next();
		// String opcode = s.next(); 
		
		// opcode.equals("+")){
		// a + b
		// }

		System.out.println("Second Number:");
		b = s.nextInt();

		// int result = 0;

		if (opcode.equals("+")) {
			result = a + b;
			// System.out.println("="+result);
		} else if (opcode.equals("-")) {
			result = a - b;
			// System.out.println("="+result);
		} else if (opcode.equals("*")) {
			result = a * b;
			// System.out.println("="+result);
		} else if (opcode.equals("/")) {
			result = a / b;
			// System.out.println("="+result);
		} else if (opcode.equals("%")) {
			result = a % b;
		} else {
			System.out.println("다시 입력하세요!");
			return;
		}
		System.out.println("Result:" + result);

	}
}