package day41_customclasses02;

public class Microwave {
	String brand;
	boolean isOn;
	
	public void turnOn() {
		if(isOn) {
			System.out.println(brand+ " is already ON");
		} else {
			System.out.println("Turning on "+brand+" microwave");
			isOn = true;
		}
	}
	
	public void turnOff() {
		if (isOn == false) {
			System.out.println(brand+ " microwave is alreadu OFF");
		} else {
			System.out.println("Turning on "+brand+" microwave");
			isOn = false;
		}
	}
	
	public void heat(String food) {
		if (isOn) {
			System.out.println("Heating " + food);
		} else {
			System.out.println("Microwave is OFF, cannot heat " + food);
		}
	}
	
}
