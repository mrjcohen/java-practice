package day63_exceptions02;

public class MultiCatch {
	public static void main(String[] args) {
		
		try {
			
			System.out.println(0/0);			//Arithmetic Exception
			String str = null;
			System.out.println(str.length());	//NullPointer Exception
			int[] n = {10,4};
			System.out.println(n[2]);			//Runtime Exception
			
		} catch (ArithmeticException e) { 		//Parent exception
			System.out.println("ARITHMETIC EXCEPTION HAPPENED");
		} catch (NullPointerException e) {		//subclass exception
			System.out.println("NULLPOINTER EXCEPTION HAPPENED");
		} catch (RuntimeException e) {			//sub-subclass exception
			System.out.println("RUNTIME EXCEPTION HAPPENED: " + e.getClass().getSimpleName());
		}
		
		
		//will go to the catch that matches the exception type
		
		//can comment out different lines in the try to see which catch it goes to
		
		
	}
}
