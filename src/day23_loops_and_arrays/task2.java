package day23_loops_and_arrays;

public class task2 {
	public static void main(String[] args) {
		
		for (int i = 1 ; i <= 5 ; i++) {
			
			for (char letter = 'a' ; letter <= 'z'; letter++) {
				System.out.print(letter);
			}
			System.out.println();
			System.out.print("**************************");
			System.out.println();
		}
		
		
	}
}


//Print 5 rows of letters from a-z, in between lines print stars