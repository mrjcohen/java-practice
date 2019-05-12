package day41_customclasses02;

public class Car {
	
	String make;
	String model;
	int currentSpeed;
	String color;

	public void printCarInfo() {
		String info = "Car Make["+make+"], model["+model+"], color["+color+"], Current Speed["+currentSpeed+"]";
		System.out.println(info);
	}
	
	public void showCurrentSpeed(int speedLimit) {
		if (currentSpeed > speedLimit) {
			System.out.println(make+" "+model+ " is " +(currentSpeed - speedLimit) + " mph over speed limit");
		} else {
			System.out.println(make+" "+model+ " is following speed limit: " + currentSpeed+" mph");
		}
	}
	
	public void drive() {
		String info = make+" "+model+" is driving";
		System.out.println(info);
	}
	
	public void accellerate(int mph) {
		currentSpeed += mph;
	}
	
	
	
	
}
