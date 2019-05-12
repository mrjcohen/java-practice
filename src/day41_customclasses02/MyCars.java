package day41_customclasses02;

public class MyCars {
	public static void main(String[] args) {
		
		Car car1 = new Car();
		car1.make = "Ford";
		car1.model = "Mustang";
		car1.color = "Red";
		car1.currentSpeed = 65;
		
		car1.printCarInfo();
		car1.showCurrentSpeed(55);
		car1.drive();
		car1.accellerate(500);
		car1.printCarInfo();
		
		BMW bmw = new BMW();
		System.out.println(bmw.make);
		bmw.model = "m3";
		bmw.showPrice();
		
	}
}
