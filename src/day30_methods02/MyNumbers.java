package day30_methods02;
import java.util.Random;
import java.util.Scanner;

public class MyNumbers {
	public static void showMe5Numbers() {
		//MY METHOD
		
//		Random random = new Random();		
//		System.out.println(random.nextInt(1001)+" "+random.nextInt(1001)+" "+random.nextInt(1001)+" "+random.nextInt(1001)+" "+random.nextInt(1001));
		
		//MURODIL'S METHOD
		Random random = new Random();
		for (int i = 1 ; i <= 5 ; i++) {
			System.out.print(random.nextInt(1001)+" ");
		}
		System.out.println(); //Makes sure that after calling this method it will go to the next line
	}
	
	
	
	public static void do10PushUps() {
		for (int i = 1; i <= 10; i++) {
			System.out.println("Pushups - "+i);
		}
		System.out.println("Time to rest");
		System.out.println();
	}
	
	
	
	public static void rangePrint() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number 1");
		int num1 = scan.nextInt();
		System.out.println("Enter number 2");
		int num2 = scan.nextInt();
		if (num1 < num2) {
			for (int i = num1; i <= num2 ; i++) {
				System.out.print(i+" ");
			}
		} else if (num1 > num2) {
			for (int j = num1; j >= num2 ; j--) {
				System.out.print(j+" ");
			}
		} else {
			System.out.println(num1);
		}
		System.out.println();
	}
	
	
	
	public static void main(String[] args) {
		
		showMe5Numbers();
		showMe5Numbers();
		showMe5Numbers();
		showMe5Numbers();
		showMe5Numbers();
		do10PushUps(); 
		rangePrint();
		
		
	}
}
