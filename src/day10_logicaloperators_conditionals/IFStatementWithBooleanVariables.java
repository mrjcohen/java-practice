package day10_logicaloperators_conditionals;

public class IFStatementWithBooleanVariables {
	public static void main(String[] args) {
		
		
		
		//Two Methods to test boolean condition
		
		boolean allTrue = true;
		
		//METHOD 1
		if (allTrue == true) {
			System.out.println("True");		//True
		} else {
			System.out.println("False");
		}
		
		//METHOD 2
		if (allTrue) {
			System.out.println("True");		//True
		} else {
			System.out.println("False");
		}
		
		
		boolean allFalse = false;
		
		//METHOD 1
		if (allFalse == false) {
			System.out.println("True");		//True
		} else {
			System.out.println("False");
		}
		
		//METHOD 2
		if (allFalse) {						//In this case it is testing for true
			System.out.println("True");		//	but allFase = false so it goes to 
		} else {							//	else block
			System.out.println("False");	//False
		}
		
		
		
		
		
		
		boolean isBreakTime = true;
		
		//METHOD 1
		if (isBreakTime == true) {
			System.out.println("BREAK TILL 8:35 PM");
		} else {
			System.out.println("Not Break time yet");
		}
		
		//METHOD 2
		if (isBreakTime) {
			System.out.println("BREAK TILL 8:35 PM");
		} else {
			System.out.println("Not Break time yet");
		}
		
		
		
		
		
		boolean classTime = false;
		
		//METHOD 1
		if (classTime ==  false) {
			System.out.println("Come back on time");			
			System.out.println("Stop talking");
			System.out.println("Pay Attention");
			System.out.println("Code and have fun!");
		} else {
			System.out.println("Take a walk and have some water.");
		}
		
		//METHOD 2
		if (classTime) {
			System.out.println("Come back on time");			
			System.out.println("Stop talking");
			System.out.println("Pay Attention");
			System.out.println("Code and have fun!");
		} else {
			System.out.println("Take a walk and have some water.");
		}
		
		
		
	}
}
