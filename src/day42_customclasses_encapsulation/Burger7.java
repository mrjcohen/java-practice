package day42_customclasses_encapsulation;

import java.util.Arrays;

public class Burger7 {
	public static void main(String[] args) {
		
		Burger burger1 = new Burger();
		burger1.name = "COWBOY";
		String[] ings = {"onion crisps" , "american cheese" , "pickles" , "lettuce" , "b7 sauce"};
		burger1.ingredients = ings;
		
		System.out.println(burger1.name);
		System.out.println(Arrays.deepToString(burger1.ingredients));
		//print first element in object variable array, ingredients
		System.out.println(burger1.ingredients[0]);
		
		//loop through all elemets in object variable array, ingredients
		for(String i : burger1.ingredients) {
			System.out.println(i);
		}
		
	}
}
