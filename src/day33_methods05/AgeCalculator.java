package day33_methods05;

public class AgeCalculator {
	public static int calculateAge (int year) {
		
		int currentYear = 2019;
		int age = currentYear - year;
		//invalid age -1
		//child 1-14
		//youngster 15-25
		//adult 26-64
		//senior 65+
		
		if (age < 0) {
			System.out.println("invalid age");
			return 0;
		} else if (age >= 0 && age <= 14) {
			System.out.println("child");
		} else if (age >= 15 && age <= 25) {
			System.out.println("youngster");
		} else if (age >= 26 && age <= 64) {
			System.out.println("adult");
		} else {
			System.out.println("senior");
		}
		return age;
	
	}
	public static void main(String[] args) {
		
		int age = calculateAge(1994);
		System.out.println("You are "+ age + " years old");
		
		int age2 = calculateAge(1975);
		System.out.println("You are "+ age2 + " years old");
		
		System.out.println(calculateAge(2025));
		
	}
}
