package day50_inheritance03;

public class IPhoneApp extends App{

	private String developer;
	
	//Since the Parent class has a 1-arg constructor you need one in the child class:
	// You can use a no arg contructor with an 1-arg String super since the parent class has
	// A 1-arg string constructor. Aleternatively vvvvvv
	public IPhoneApp() {
		super("iPhoneApp - unknown");
	}
	
	//You can autogenerate a 1 arg constructor that matches the 1-arg constructor 
	// that is in the parent class
	public IPhoneApp(String name) {
		super(name);
	}
}