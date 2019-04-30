package day24_arrays;

public class Cities {
	public static void main(String[] args) {
		String [] cities = {"Washington D.C." , "Kiev" , "Annandale" ,
							"Moscow" , "Istanbul" , "Baku" , "Miami" , 
							"Silver Spring" , "McLean"};
		System.out.println(cities.length); // 9
		//Print all cities that starts with M using FOR LOOP
		for (int i = 0 ; i < cities.length ; i++) {
			if (cities[i].startsWith("M")) {
				System.out.println(cities[i]);
			}
		}
		//Print all cities that start with M using FOR EACH LOOP
		for (String city: cities) {
			if (city.startsWith("M")) {
			System.out.println(city);
			}
		}
		//Print all cities in the array using a FOR EACH LOOP
		for (String city: cities) {
			System.out.println(city);
		}
	
		
	}
}
