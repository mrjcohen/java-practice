package day21_loops_practice1;

import java.util.Scanner;

public class Register {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("How many items pruchased");
		int itemsPurchased = scan.nextInt();
		String itemName = "";
		double itemPrice = 0;
		double totalPrice = 0;
		String allItems = "";
		
		for (int i = 1 ; i <= itemsPurchased ; i++ ) {
			
			System.out.println("What is the item " +i+ "?");
			itemName = scan.next();
			
			System.out.println("How much is " +itemName+ "?");
			itemPrice = scan.nextDouble();
			
			allItems += itemName + ", ";
			totalPrice += itemPrice;
			
		}
		
		System.out.println("Your Items: "+allItems);
		System.out.println("Your total Price $: " +totalPrice);
		
	}
}

/*
		Create a program called Register.

		It will ask user how many items he purchased.

		Then based on that number it will ask item name and price that many times.

		You need to gather all items in one String variable items separated by comma

		And calculate sum of each item price into variable totalPrice.

		Then print out items and total price.

		Example:

		How many items are you purchasing?

		2

		What is item 1?

		Gloves

		How much is Gloves?

		10.44

		What is item 2?

		Hat

		How much is Hat?

		13

		----------

		Your items: Gloves, Hat

		Your total Price: $23.44
*/