package day60_polymorphism02;

public class IPad extends AppleDevice {
	
	public double screenSize = 12.9;

	@Override
	public void use() {
		System.out.println("Ipad | Music | Read book | Cartoon");
	}
	
	public void draw() {
		System.out.println("Drawing shapes using iPad");
	}
}
