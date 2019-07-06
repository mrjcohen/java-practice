package day55_abstraction;

public abstract class Vehicle {

// Instance Variables
	private int wheels;
	private double price;
	private String type;
	private String powerSource;

//Constructors
	public Vehicle(int wheels, double price, String type, String powerSource) {
		this.wheels = wheels;
		this.price = price;
		this.type = type;
		this.powerSource = powerSource;
	}
	
//Getters and Setters
	public int getWheels() {
		return wheels;
	}

	public void setWheels(int wheels) {
		this.wheels = wheels;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getPowerSource() {
		return powerSource;
	}

	public void setPowerSource(String powerSource) {
		this.powerSource = powerSource;
	}
	
//abstract methods
	public abstract void move();

}
