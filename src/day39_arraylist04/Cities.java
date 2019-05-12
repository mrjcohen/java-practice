package day39_arraylist04;

import java.util.*;

public class Cities {
	public static void main(String[] args) {
		
//WARM-UP ACTIVITY
		
		ArrayList<String> cities = new ArrayList<>();
        
        cities.add("Tokyo");
        cities.add("New York");
        cities.add(0,"Paris");
        cities.add("Pittsburgh");
        cities.add(1,"Berlin");
        cities.add("Madrid");
        cities.add("Moscow");
        cities.add("Istanbul");
        cities.add("Washington D.C.");
        cities.add("Amsterdam");
        cities.add("Zurich");
        cities.add("Singapore");
        cities.add("Milan");
        cities.add("Toronto");
        cities.add("London");
        cities.add("Lima");
        
//PRINT ALL CITIES WITH FOR EACH LOOP
        
        for (String city : cities) {
        	System.out.print(city+ " | ");
        }
        System.out.println();
        
//PRINT ALL CITIES WITH FOR LOOP
        
        for (int i = 0 ; i < cities.size() ; i++) {
        	System.out.print(cities.get(i) + " | " );
        }
        System.out.println();
        
//toString. PRINT EACH CITY ALL UPPERCASE
        
        System.out.println(cities.toString().toUpperCase());
        
//MAKE EACH CITY ALL UPPERCASE
        
        for (int j = 0 ; j < cities.size() ; j++) {
        	//cities.set(j, cities.get(j).toUpperCase());  <-- Doing it in one line
        	String city = cities.get(j).toUpperCase();
        	cities.set(j, city);
        }
        System.out.println(cities.toString());
        
//FIND THE LONGEST CITY
        
        
        String longestCity = "";
        
        for (String city : cities) {
        	if (city.length() > longestCity.length()) {
        		longestCity = city;
        	}
        }
        System.out.println("Longest City: " +longestCity);
        
//FIND THE SHORTEST CITY
        
        String shortestCity = cities.get(0);
        
        for (String city : cities) {
        	if (city.length() < shortestCity.length()) {
            	shortestCity = city;
        	}
        }
        System.out.println("Shortest City: " +shortestCity);
        
//CREATE NEW ARRAYLIST AND ASSIGN ALL CITIES THAT HAVE MORE THAN 6 CHARACTERS 
        
        ArrayList<String> citiesMoreThan6 = new ArrayList<>();     
        
        for (String city : cities) {
        	if (city.length() > 6) {
        		citiesMoreThan6.add(city);
        	}
        }
        
        System.out.println(citiesMoreThan6.toString());
        
 
        
		
	}
}
