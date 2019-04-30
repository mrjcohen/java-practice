package day31_methods03;

import java.util.Scanner;

public class Calculator {
	public static void add(double x, double y) {
		System.out.println(x+y);
	}
	public static void subtract(double x, double y) {
		System.out.println(x-y);
	}
	public static void multiply(double x, double y) {
		System.out.println(x*y);
	}
	public static void divide(double x, double y) {
		System.out.println(x/y);
	}
	public static void remainder(double x, double y) {
		System.out.println(x%y);
	}
	
	public static void main(String[] args) {

		
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter two numbers");
		double n1 = scan.nextDouble();
		double n2 = scan.nextDouble();
		System.out.println("Select + , - , * , / , %");
		String operator = scan.next();
		switch (operator) {
		case "+":
			add(n1,n2);
			break;
		case "-":
			subtract(n1,n2);
			break;
		case "*":
			multiply(n1,n2);
			break;
		case "/":
			divide(n1,n2);
			break;
		case "%":
			remainder(n1,n2);
		}
		
		
	}
}
