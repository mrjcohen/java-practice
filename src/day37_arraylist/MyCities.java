package day37_arraylist;

import java.util.ArrayList;

public class MyCities {
	public static void main(String[] args) {
		
		ArrayList<String> cities = new ArrayList<>();
		
		cities.add("Barnaul");
		cities.add("Dushanbe");
		cities.add("Sterling");
		cities.add("Baku");
		cities.add("Tashkent");
		cities.add("Baku");

		//print each city using for each loop seperated by spaces
		for (String city : cities) {
			System.out.print(city + " ");
		}
		System.out.println();
		
		
		//print each city using for loop seperated by spaces
		for (int i = 0 ; i < cities.size() ; i++) {
			System.out.print(cities.get(i) + " ");
		}
		System.out.println();
		
		
		//remove Baku (it is in the arrayList twice) .remove() removes the FIRST INSTANCE ONLY
		System.out.println(cities.toString());
		cities.remove("Baku");
		System.out.println(cities.toString());
		
		//remove something that doesnt exist - Does nothing. Does not give error either
		System.out.println(cities.toString());
		cities.remove("Paris");
		System.out.println(cities.toString());
		
		
		//isEmpty?
		System.out.println("Is the cities arrayList empty?: " + cities.isEmpty());
		
		//add to arrayList at a specific location
		System.out.println(cities.toString());
		cities.add(0,"Bishkek");
		System.out.println(cities.toString());
		cities.add(1,"Istanbul");
		System.out.println(cities.toString());
		
		
		//replace a value in an arrayList
		System.out.println(cities.toString());
		cities.set(2, "Seoul");
		System.out.println(cities.toString());
		
		
		//find the index of a value
		int idx = cities.indexOf("Sterling");
		System.out.println("Sterling index " + idx);
		
		//find and replace
		System.out.println(cities.toString());
		cities.set(cities.indexOf("Sterling"),"Zagreb");
		System.out.println(cities.toString());
		
		//clear the array
		cities.clear();
		System.out.println("Is the array empty? :" + cities.isEmpty());
		
		
	}
}
