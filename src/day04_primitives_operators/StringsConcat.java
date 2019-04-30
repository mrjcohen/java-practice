package day04_primitives_operators;

public class StringsConcat {
	public static void main(String[] args) {
		
		String firstName = "Jon";
		String lastName = "Cohen";
		System.out.println("My name is " + firstName + " " + lastName);
			
		
		String city = "St. Julien";
		System.out.println("I was born in " + city);
		
		
		String job = "SDET";
		String company = "Intel";
		System.out.println("I work as " + job + " in " + company);
		
		
		int zipcode = 22302;
		System.out.println("I live in " + zipcode + " zipcode");
		
		
		
		//adding vs concatenating two int variables
		int num1 = 10;
		int num2 = 20;
		
		System.out.println(num1+num2);
		System.out.println(num1+""+num2);
	}

}
