package day08_casting_conditionals;

public class CastingPrimitives {
	
	public static void main(String[] args) {
		
		//cast double value to integer
		
		int i = (int)3.4;
		System.out.println("i: " +i);								//3
		
		
		double price = 230.50;
		int dollars = (int)price;
		System.out.println("dollars: " +dollars);					//230
		
		int count = 44;
		byte byteCount = (byte)count;
		System.out.println("byteCount: " +byteCount);				//44
		
		int large = 5678;
		short small = (short)large;
		System.out.println("Small: " +small);						//5678
		
		// int result = (int)500.4 / 2.0;      -> will not work
		int result = (int)(500.4 / 2.0);
		System.out.println("result: " +result);						//250
		
		
		
		
		
		
		
		
	}

}
