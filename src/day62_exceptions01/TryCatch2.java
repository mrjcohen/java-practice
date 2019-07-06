package day62_exceptions01;

public class TryCatch2 {
	public static void main(String[] args) {
		
		int[] nums = {34,6,34,12};
		
		try {
			System.out.println(nums[6]);
		} catch (Exception e) {
			System.out.println("Wrong index");
		}
		System.out.println("Some code after arrays");
		
		
		
		
		try {
			int j = 100;
			int n = j / 0;  //arithmetic exception - cant divide by zero
			System.out.println(n);
		} catch (ArithmeticException e) {
			System.out.println("Cannot divide by zero");
			e.printStackTrace();
		}
		
		System.out.println("AFTER TRY CATCH");
		
		
		
		
	}
}
