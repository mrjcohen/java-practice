package day34_methods06;

import java.util.Arrays;

public class VarArgs {
	public static void printWords (String... words) {    //This can only be used in methods parameter and nowhere else
		for (String w : words) {
			System.out.println(w);
		}
	}
	
	public static int sum (int... nums) {
		int sum = 0;
		for (int n : nums) {
			sum += n;
		}
		return sum;
	}
	
	public static void cook(String dish , String ...ingredients ) {	
		System.out.println("Food: "+dish);
		System.out.println(Arrays.toString(ingredients));
	}
		
	public static void shoppingList (int totalPrice, String... items ) {
		System.out.print("Total cost: " + totalPrice);
		System.out.println(Arrays.toString(items));
	}	
		
	public static void main(String[] anythingYouWantToCallIt) {
		
		
		printWords("red","blue","yellow");
		printWords(); 									//Creates an empty array
		
		
		
		
		int total = sum('a','b','c');
		System.out.println(total);
		
		int[] arr1 = {1,2,3,4};
		System.out.println(sum(arr1));
		
		
		int budget = 200;
		int cost = sum(10,45,110,30);
		
		if (cost <= budget ) {
			System.out.println("You are within budget");
			System.out.println("You have $" +(budget-cost)+ " left over");
		} else {
			System.out.println("You are broke");
			System.out.println("You went $" +(cost-budget) + " over budget");
		}
		
		
		
		
		cook("Burrito Bowl" , "Rice" , "Beans" , "Meat" , "Cheese");
		
		
		shoppingList(1000, "toast" , "Swatch watch" , "Shoes" , "Jacket");

		
		
		
	}	
}
