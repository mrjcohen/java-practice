package day49_inheritance02;

//TV is a subclass (child class) in the same package
public class TV extends Device{
	
	//brand is a public variable to its accessable in the subclass in the same packaged
	public void watch() {
		System.out.println("Watching TV = " + brand + "model: "+ model);
		System.out.println("Price: " + price);
		//Private no visible here
		//System.out.println("Made in " + country);
	}
	
}
