package day62_exceptions01;

public class ExceptionInCatch {
	public static void main(String[] args) {
		
		
		String str = "10j";									//A
		
		try {
			int n = Integer.parseInt(str);  				//B
			System.out.println(n);							//C
		} catch (NumberFormatException e) {
			System.out.println(str.charAt(10));				//D
			System.out.println("hello from catch");	 		//E
		} finally {
			System.out.println("hello from finally");		//F
		}
		System.out.println("Bye Bye");						//Z
		
		
		
	}
}
