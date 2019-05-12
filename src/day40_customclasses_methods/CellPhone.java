package day40_customclasses_methods;

public class CellPhone {

	String brand;		//default value: null
	double screenSize;	//default value: 0.0
	String color;		//default value: null
	double price;		//default value: 0.0
	
	
	public void call() {
		System.out.println("Calling .... ");
	}
	
	public void message() {
		System.out.println("Sending txt message .... ");
	}
	
	public void takeAPhoto() {
		System.out.println("Taking a photo .... ");
	}
	
}
