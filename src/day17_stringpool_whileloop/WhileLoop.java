package day17_stringpool_whileloop;

public class WhileLoop {
	public static void main(String[] args) {
		
		int n1 = 100;
		int n2 = 200;
				
		
		//This will run forever because n2 > is always greater than n1
		while (n2 > n1) {
			System.out.println("n2 is greater");
		}
		
		System.out.println("END");
		
		
		
		//This will run 10 times because n2 > n1 but n1 is adding 10 to it after each run
		while (n2 > n1) {
			System.out.println("n2 is greater");
			n1 = n1 + 10;
		}
		
		System.out.println("END");
		
		
		
		
		
	}
}
