package day37_arraylist;

import java.util.ArrayList;

public class Shopping {
	public static void main(String[] args) {
		
		//Create an arraylist
		ArrayList<String> shoppingList = new ArrayList<>();
		
		//Add to the arraylist
		shoppingList.add("paper towel");
		shoppingList.add("dish soap");
		shoppingList.add("trash bag");
		shoppingList.add("clorox");
		shoppingList.add("gloves");
		shoppingList.add("shovel");
		
		//print number of items in array list
		int count = shoppingList.size();
		System.out.println("total count in Array List: "+count);
		
		//list items in the arraylist
		System.out.println(shoppingList.toString());
		System.out.println(shoppingList);
		
		//print first and last item in the arraylist
		System.out.println(shoppingList.get(0));
		System.out.println(shoppingList.get(shoppingList.size()-1));
		
		//remove the first item
		shoppingList.remove("paper towel");
		System.out.println(shoppingList);
		
		//remove the first index
		shoppingList.remove(0);
		System.out.println(shoppingList);
		
		//for each loop with arrayLists - For each loop can only be used from reading and cant be used to modify lists
		for (String item : shoppingList) {
			System.out.println(item);
		}
		
		//remove all items in an arrayList
		shoppingList.clear();
		System.out.println(shoppingList.toString());
		
		
		
		
	}
}
