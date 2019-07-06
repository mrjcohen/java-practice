package day46_static_keyword;

public class Vehicle {
	String type;					//non-static, every object has its own type
	static int numberOfVehicles;	//static, shared on cetnral value
	
	public static void vehicleInfo() {
		//System.out.println("type: " + type);  <- wont work since type is nonstatic and the method is static
		System.out.println("Number of vehicles: " + numberOfVehicles);
		int c = getNumberOfVehicles();
		String make = "kia";
		make = make.toUpperCase();
		System.out.println("Make: " + make);
		
		
	}
	
	public static int getNumberOfVehicles() {
		return numberOfVehicles;
	}
	
	public String toString() {
		return "Vehicle type: " + type + " | count: " + numberOfVehicles;
	}
	
}
