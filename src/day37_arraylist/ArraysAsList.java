package day37_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class ArraysAsList {
	public static void main(String[] args) {
		
		List<String> cars = new ArrayList<>();
		cars.add("Honda");
		
		//Pre-populating an arraylist will cause it to have a fixed size. Cant add or remove
		List<Integer> nums = Arrays.asList(4,2,5,7,8);
		System.out.println(nums.size());
		System.out.println(nums.toString());
		
		//nums.add(100);   Doesnt work with predefined arraylists
		System.out.println(nums.toString());
		
		//create arraylist prices
		//assign values using arrays.asList method
		
		List<Double> prices = Arrays.asList(100.00 , 123.00 , 241.23 , 35.45 , 4565.56 , 432.54 , 55.54 , 455.65 , 5466.65 , 9878.54);
		
		
		
		//calculate the sum of all prices with a for loop
		double sumForLoop = 0;
		
		for (int i = 0 ; i < prices.size(); i++) {
			sumForLoop += prices.get(i);
		}
		System.out.println(sumForLoop);
		
		
		
		
		//calculate the sum of all prices with a for each loop
		double sumForEachLoop = 0;
		
		for (double price : prices) {
			sumForEachLoop += price;
		}
		System.out.println(sumForEachLoop);
		
		
		//create new list expensive then add prices that are more than 100
		List<Double> expensive = new ArrayList<>();
		
		for (double price : prices) {
			if (price > 100.00) {
				expensive.add(price);
			}
		}
		
		System.out.println(expensive.toString());
		
		

		
		
		
		
		
	}
}
