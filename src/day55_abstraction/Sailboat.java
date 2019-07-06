package day55_abstraction;

public class Sailboat extends Vehicle{
	
	private int length;
	
	public Sailboat(double price, int length) {
		super(0, price, "sailboat", "wind");
		this.length = length;
	}

	public void move() {
		System.out.println("Sails...");
	}
	
	public int getLength() {
		return length;
	}

}
