package day24_arrays;

import java.util.Arrays;

public class CarShop {
	public static void main(String[] args) {
		//BMW, Audi, Ford, Honda, Mercedes, Mercury, Rolls-Royce, Tesla
		//1. Create an array of strings and store the car makes inside the array
		String[] cars = {"BMW", "Audi", "Ford", "Honda", "Mercedes", "Mercury", "Rolls-Royce", "Tesla"};
		//2. Print car makes that starts with 'M'
		for (String i: cars) {
			if (i.toUpperCase().startsWith("M")) {
				System.out.println(i);
			}
		}
		System.out.println("**********************");
		//3. Print all car makes that contains "r" somewhere in the name
		//Make search case insensitive
		for (String i: cars) {
			if (i.toLowerCase().contains("r")) {
				System.out.println(i);
			}
		}
		System.out.println("**********************");
		//4. Print all car makes that ends with "a"
		for (String i: cars) {
			if (i.toLowerCase().endsWith("a")) {
				System.out.println(i);
			}
		}
		System.out.println("**********************");
		//5. Print all car makes that have at least 6 letters
		for (String i: cars) {
			if (i.length() >= 6) {
				System.out.println(i);
			}
		}
		System.out.println("**********************");
		//6. Swap first and last value in the array
		String temp = cars[0];
		cars[0] = cars[cars.length-1];
		cars[cars.length-1] = temp;
		System.out.println(Arrays.toString(cars));
		//7. Sort the car makes in alphabetical order
		Arrays.sort(cars);
		System.out.println(Arrays.toString(cars));
	}
}
