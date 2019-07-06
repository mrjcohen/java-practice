package day63_exceptions02;

public class MethodsWithThrows {
	
	public static void main(String[] args) throws Exception{
		
		/*
		 * We are calling a method that throws a CHECKED exception.
		 * WE must either HANDLE or DECLARE for it to compile
		 */
		try {
			playWithMatches();
		} catch (Exception e) {
			System.out.println("STOPPED the fire with Extinguisher");
		}
		
		
		
		playWithMatches();
		
		//unchecked exptions dont need to be handled or declared
		playSoccer();
		
		//custom created Exception
		throw new UnsufficientFundsException();
		
		
		
	}
	
	public static void playWithMatches() throws Exception { //checked exception
		System.out.println("Playing with matches can cause fire");
	}

	public static void playSoccer() throws RuntimeException { //unchecked exception
		System.out.println("Playing soccer with friends");
	}
}
