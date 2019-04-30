package day08_casting_conditionals;

public class ExplicitCasting {
	public static void main(String[] args) {
		
		System.out.println(10 / 2.0);   //In this situation the output will be [5.0]
										//because it will use the larger number type
										//which in this case is double (since 2.0)
										//has a decimal point.
		
		
		
		
		//int result = 10/2.0;			This will not work because the result is 
										//a double and the variable result was 
										//defined as int
				
		int result = (int)(10/2.0);     //This will work because casting converts
										//the result to int
		System.out.println(result);		//result = 5
		
		
		int rent1 = 987;
		int rent2 = 1100;
		int rent3 = 894;
		int rent4 = 1234;
		
		double average1 = (rent1+rent2+rent3+rent4) / 4;			//1053.0  !!Since no double was used in the calculation 0.75 was lost!!
		System.out.println(average1);
		
		double average2 = (rent1+rent2+rent3+rent4) / 4.0;			//1053.75
		System.out.println(average2);
		
		double average3 = (double)(rent1+rent2+rent3+rent4) / 4;	//1053.75
		System.out.println(average3);
		
		
		
		double d = 40.2;			//implicit double > byte
		int i = (byte)d;			//explicit byte > int
		
		
		
		
		
		
		
	}

}
