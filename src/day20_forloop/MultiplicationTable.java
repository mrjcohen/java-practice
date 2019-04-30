package day20_forloop;

import java.util.Scanner;

public class MultiplicationTable {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter number:");
		int num = scan.nextInt();
		
		
		if (num <= 10 && num >=1) {
			
			for (int i = 1 ; i <= 10 ; i++) {
				
				int answer = num * i;
				System.out.println(num+" x "+i+" = "+answer);	
			}
	
			
		} else {
			
			
			System.out.println("Error: Invalid number");
			return;
			//System.exit(0);   //Stops execution as well
			
		}
		
		
		
	}
}
