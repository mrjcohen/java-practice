package day42_customclasses_encapsulation;

import java.util.*;

public class Starbucks {
	public static void main(String[] args) {
		//declare an array that can store 2 coffee objects
		Coffee[] coffeeArray = new Coffee[2];
		//create coffee object and assign to index 0
		coffeeArray[0] = new Coffee();
		//access coffee object in index 0 and set data (custom method)
		coffeeArray[0].setCoffeeInfo("ESPRESSO", "TALL", 2.55, 7);
		//acces coffee object in index 0 and get coffee info (cutom method)
		coffeeArray[0].getCoffeeInfo();
		
		
		//Create object first as a single variable
		Coffee latte = new Coffee();
		//Assign data to object "latte" 
		latte.setCoffeeInfo("CAFE LATTE", "GRANDE", 3.85, 190);
		//Assign the object "latte" to index 1
		coffeeArray[1] = latte;
		//acces coffee object in index 0 and get coffee info (cutom method)
		coffeeArray[1].getCoffeeInfo();
		
	}
}
