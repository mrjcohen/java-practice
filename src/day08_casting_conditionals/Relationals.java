package day08_casting_conditionals;

public class Relationals {

	public static void main(String[] args) {
		
		double d1 = 23.56;
		double d2 = 20.43;
		
		System.out.println(d1>= d2);				//true
		boolean check = d1 >= d2;
		
		System.out.println("Check: " + check);		//true
		
		
		
		
		char ch1 = 'a';			//ASCII 97
		char ch2 = 'j';			//ASCII 
		char ch3 = 'A';			//ASCII 65
		
		System.out.println(ch2 > ch1);				//true 	'j' > 'a'
		System.out.println(ch1 > ch3);				//true 	'a' > 'A'
		
		
		
		
		
		//boolean b = true > false;    - cant use greater/less than with boolean
		boolean b = true == false;     //you can use == and !=
		System.out.println("b: "+b);
		boolean x = true != false;     //you can use == and !=
		System.out.println("x: "+x);
		
		
	
		
		
		
		
	}
	
}
