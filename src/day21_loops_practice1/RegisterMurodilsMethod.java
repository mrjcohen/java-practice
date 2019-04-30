
package day21_loops_practice1;

import java.util.Scanner;

public class RegisterMurodilsMethod {
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner (System.in);
		
		System.out.println("How many items pruchased");
		int itemsCount = keyboard.nextInt();
		double totalPrice = 0;
		String itemList = "";
		
		
		
		for (int count = 1 ; count <= itemsCount ; count++ ) {
			
			System.out.println("What is the item " +count+ "?");
			String itemName = keyboard.next();
			
			System.out.println("How much is " +itemName+ "?");
			double itemPrice = keyboard.nextDouble();
			
			itemList += itemName+ ", ";
			totalPrice += itemPrice;
		}
		
		//dont use substring to remove the last comma > Either inside the loop or outside
		//itemList = itemList.lastIndexOf(", ").replace(", ", "");
		System.out.println("Your Items: "+itemList);
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