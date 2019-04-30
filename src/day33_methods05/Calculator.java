package day33_methods05;

public class Calculator {
	public static void addVoid (int num1, int num2) {
		int sum = num1 + num2;
		System.out.println(sum);
	}
	public static double add (double num1, double num2) {
		double sum = num1 + num2;
		return sum;
	}
	public static double subtract ( double num1, double num2) {
		double sum = num1 - num2;
		return sum;
	}
	public static double multiply ( double num1, double num2) {
		double sum = num1 * num2;
		return sum;
	}
	public static double divide ( double num1, double num2) {
		if (num2 == 0) {
			System.out.println("ERROR: Cannot divide by 0");
			return(0);
		} else {
			double sum = num1 / num2;
			return sum;
		}
	}
	
	
	public static void main(String[] args) {
		addVoid(5,6);
		System.out.println(add(9,12));
		divide(5,0);
	}
}
