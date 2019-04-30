package day08_casting_conditionals;

public class ImplicitCasting {
	public static void main(String[] args) {
		
		//Automatic Casting from smaller to larger type
		
		short shortValue = 3455;
		int intValue = shortValue;						//int intValue = (int)shortValue;   -> adding castig is optional
		System.out.println("intValue: " +intValue);		//2455
				
		double price = 345;								//declaring a double variable with an integer number will convert to double number
		System.out.println("price: " +price);			//345.0
		
		int price1 = 24563;
		double dPrice = price1;
		System.out.println(dPrice);
		
		
	}

}
