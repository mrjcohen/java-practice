package day46_static_keyword;

public class CalcTest {
	public static void main(String[] args) {
		
		double result = Calculator.plus(55,7); //static way (calling method direcly)
		System.out.println(result);
		
		result = Calculator.minus(44,14);
		System.out.println(result);
		
		Calculator c = new Calculator();
		c.multiply(4, 2);   //Error:The static method multiply(double, double) from the type Calculator should be accessed in a static way
		System.out.println(c);
		
		
	}
}
