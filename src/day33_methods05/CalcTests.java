package day33_methods05;

public class CalcTests {
	public static void main(String[] args) {
		//SEVERAL WAYS TO PRINT OUT THE RESULTS OF THE METHOD
		
		//1. DIRECTLY PRINT OUT USING SYSOUT
		System.out.println(Calculator.add(3, 1));
		System.out.println(Calculator.multiply(5, 6));
		System.out.println(Calculator.divide(100, 2));
		System.out.println(Calculator.subtract(40, 12));
		
		//2. ASSIGN METHOD OUTPUT TO A VARIABE AND THEN SYSOUT THE VARIABLE
		double addResult = Calculator.add(21, 41);
		double mResult = Calculator.multiply(50, 40);
		double subResult = Calculator.subtract(3000, 200);
		double dResult = Calculator.divide(455, 5);
		
		System.out.println(addResult);
		System.out.println(mResult);
		System.out.println(subResult);
		System.out.println(dResult);
		
		//YOU CAN PASS VARIABLES DIRECTLY INTO THE METHOD
		double a = 10.0, b = 5.0;
		double myResult = Calculator.subtract(a, b);
		System.out.println(myResult);
		
		//YOU CAN PASS double ARRAY VALUES IN THE METHODS
		double[] dNums = {2.0 , 4.0};
		double result2 = Calculator.multiply(dNums[0], dNums[1]);
		System.out.println(result2);
		
		//USING METHODS WITH COMPARISON OPERATOR
		if (Calculator.add(10, 16) == 26) {
			System.out.println("Add Unit Test Passed");
		} else {
			System.out.println("Add Unit Test Failed");
		}
		
		
		
		
	}
}
