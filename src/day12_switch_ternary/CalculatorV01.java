package day12_switch_ternary;

import java.util.Scanner;

public class CalculatorV01 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter first number:");
		double num1 = scan.nextDouble();
		
		System.out.println("Enter second number:");
		double num2 = scan.nextDouble();
		
		System.out.println("Select Operation: +, -, *, /, %");
		String operator = scan.next();
		
		double answer = 0;
		
		if (operator.equals("+")) {
			answer = num1 + num2;
		} else if (operator.equals("-")) {
			answer = num1 - num2;
		} else if (operator.equals("*")) {
			answer = num1 * num2;
		} else if (operator.equals("/")) {
			answer = num1 / num2;
		} else if (operator.equals("%")) {
			answer = num1 % num2;
		} else {
			System.out.println("Invalid Operator: " +operator);
			return;		//return; will top code here and not proceed any further
		}
		
		
		System.out.println(num1+ " " +operator+ " " +num2+ " = " +answer);
		
	}

}
