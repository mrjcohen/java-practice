package day49_inheritance02;

public class Leopard extends Animal{
	
	public Leopard() {
		//super(); //calls parent class no-args constuctor
		System.out.println("Leopard no-arg contructor");
		setType("Leopard");
	}
	
	public Leopard(String type) {
		super(type); // calls parent class 1-args constructor
		System.out.println("Leopard 1-arg contructor");
		
	}

	
}
