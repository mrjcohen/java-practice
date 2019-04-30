package day28_multid_arrays;

//(nio) == New input/output
import java.io.IOException;
import java.nio.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FastFoodRestaurants {
	public static void main(String[] args) throws IOException {
		//Read all data and assign to array
		String[] data = Files.readAllLines(Paths.get("FastFoodRestaurants.csv")).toArray(new String[0]);
		
		System.out.println("Data size: "+data.length);
		
		//print first row
		System.out.println(data[0]);
		//print second row
		System.out.println(data[1]);
		//print last row
		System.out.println(data[data.length-1]);
		
		//Print each restaurant information in separate lines and add a number next to it
		int count = 1;
		for (String restaurant : data) {
			System.out.println("#"+count+" => "+restaurant);
			count++;
		}
		
		//Print all restaurants that are in  and count how many there are
		int vaCount = 0;
		for (String restaurant : data) {
			
			if (restaurant.contains(",VA,")) {
				System.out.println(restaurant);
				vaCount++;
			}	
		}
		System.out.println("There are "+vaCount+" restaurants in VA");
		
		
		//Find all restaurants in VA and then print "Restaurant Name -  city name"
		for (String restaurant : data) {
			
			if (restaurant.contains(",VA,")) {
				String[] resArr = restaurant.split(",");
				System.out.println(resArr[2]+ " - "+resArr[1]);	
			}
		}
		
		
		
	}
}
