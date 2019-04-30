package day19_loops;

public class DoWhileLoop {
	public static void main(String[] args) {
		

		
		int i = 1;
		
		do {
			System.out.println(i);
			i++;
		} while (i <= 10);
		
		//OUTPUT 12345678910
		
		
		
		
		//Write a do While loop to calculate sum of numbers
		//between 1 - 5 (1 + 2 + 3 + 4 + 5 = 15
		int sum = 0;
		int j = 1;
		
		do {
			sum = sum + j;
			j++;
		} while (j <= 5);
		
		System.out.println(sum);	//15
		
		
	}
}
