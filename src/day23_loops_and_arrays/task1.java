package day23_loops_and_arrays;

public class task1 {
	public static void main(String[] args) {
		
		for (int i = 1 ; i <= 50 ; i++) {
			
			if (i%5==0) {
				continue;
			}
			
			if (i%21==0) {
				break;
			}
			
			System.out.print(i+ ", ");
			
			
		}
		
		
		
	}
}
//loop through the numbers from 1 till 50
//print each number in the same line
//if number is divisible by 5 (n%5==0), skip it
//if number is divisible by 20, then exit the loop