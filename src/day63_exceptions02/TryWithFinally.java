package day63_exceptions02;

public class TryWithFinally {
	public static void main(String[] args) {
		
		//DONT USE TRY/FINALLY IN REAL CODING
		
		try {
			System.out.println("In Try block");
			System.out.println(10/2);
		} finally {
			System.out.println("In Finally");
		}
		
		System.out.println("After try finally");
		
		
		
	}
}

