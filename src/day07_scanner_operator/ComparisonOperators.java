package day07_scanner_operator;

public class ComparisonOperators {

	public static void main(String[] args) {
		
		//All comparison operators will return a boolean (true or false)
		
		//comparing two numbers
		
		System.out.println(5 == 5);								//true
		System.out.println(50 == 5);							//false
 		
		
		//comparing a variable to a number
		
		int searchCount = 5000;
		System.out.println(searchCount == 5000);				//true
		
		
		//comparing two variables
		
		int expectedCount = 5010;
		System.out.println(searchCount == expectedCount);		//false
		
		
		
		int speedLimit = 55;
		int currentSpeed = 75;
		System.out.println(currentSpeed == speedLimit); 		//false
		
		boolean atLimit = currentSpeed == speedLimit;
		System.out.println("At speed limit: " + atLimit);		//false
		
		boolean overLimit = currentSpeed > speedLimit;
		System.out.println("Over speed limit: " + overLimit);	//true
		
		
		boolean underLimit = currentSpeed < speedLimit;
		//boolean underLimit = speedLimit > currentSpeed;
		
		System.out.println("Under limit: " + underLimit);		//false
		
		
	
		double balance = 150.0;
		boolean broke = balance <= 0.0;
		System.out.println("Are you broke? " + broke);			//false
		
		double transaction = 155.50;
		
		broke = (balance - transaction) < 0;
		
		System.out.println("Will make broke? " + broke); 		//true
		System.out.println("Balance: " + balance);
		
		
		
	}
	
}
