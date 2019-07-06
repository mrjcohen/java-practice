package day62_exceptions01;

public class TryCatchFinally {
	public static void main(String[] args) {
		
		String str = "selenium";
		
		try {
			System.out.println(str.length());    //good code
			System.out.println(str.charAt(100)); //errored code
		} catch (Exception e) {
			System.out.println("Enter correct index");
			return;
		} finally {
			System.out.println("Finally block");
		}
		
		
		
		
	}
}
