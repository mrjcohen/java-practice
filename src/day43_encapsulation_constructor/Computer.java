package day43_encapsulation_constructor;

public class Computer {
	private String brand;
	private String os;
	private double price;
	
	//add a constructor
	public Computer(){
		System.out.println("Computer constructor...");
		brand = "unknown";
		os = "unknown";
	}
	
	public Computer(String brand, String os, double price) {
		System.out.println("In 3 args constructor...");
		this.brand = brand;
		this.os = os;
		this.price = price;
	}
	

	public String toString() {
		return "Computer [brand=" + brand + ", os=" + os + ", price=" + price + "]";
	}
	

	public String getBrand() {
		return brand;
	}
	
	public String getOs() {
		return os;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public void setOs(String os) {
		this.os = os;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
}
