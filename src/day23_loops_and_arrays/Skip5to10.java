package day23_loops_and_arrays;

public class Skip5to10 {
	public static void main(String[] args) {
		
		//Print 1 to 20 and skip 5 to 10
		
		for (int i = 1 ; i <= 20 ; i++) {
			
			if (i >= 5 && i <= 10) {
				continue;
				
			}
			
			System.out.println(i);
		}
		
		
		
	}
	
}
