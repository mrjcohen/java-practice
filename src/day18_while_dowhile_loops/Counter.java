package day18_while_dowhile_loops;

public class Counter {
	public static void main(String[] args) throws InterruptedException {   //throws InterruptedException is needed to use Thread.sleep(1000);
		
//		Output: 1,2,3,4,5,6,7,8,9,10
		
		int num = 1;
		
		while (num <= 10) {
			
			System.out.print(num+ ", ");	//1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 
			num++;
			Thread.sleep(1000);   //Runs each part of the loop 1000 milliseconds (1 second) per loop
			
		}
		
		System.out.println("\nnum value after the loop is "+num); 	//num value after the loop is 11
		
		
		
//		Output: 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1
		
		int num2 = 11;
		
		while (num2 >= 1) {
			
			System.out.print(num2+", ");	//11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 
			num2--;
			Thread.sleep(456);
			
		}
		
		System.out.println("\nnum2 value after the loop is "+num2);   //num2 value after the loop is 0
		
		
	}
	
	
}
