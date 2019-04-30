package day09_stringequals_condtionals;

public class IfElseNoBraces {
	public static void main(String[] args) {
		
		String day = "Tuesday";
		
		if (day.equals("Tuesday")) 
			System.out.println("Today is Tuesday");
		 else 
			System.out.println("Today is not Tuesday");
			System.out.println("Tuesday is not today");		//This line is not part of the else block since there are not curly braces.
															//   it will still run because it is the next line after the else block
		
		
		
	}

}
