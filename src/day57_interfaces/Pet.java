package day57_interfaces;

public interface Pet {
	
	public static final boolean FRIENDLY = true;
	
	public abstract void keepAsPet();
	
	//default means that the all other classes that want to implement this method can override 
	//  or use this implementation by default or not use it at all
	public default void play() {		
		System.out.println("playing hide-and-seek with a pet");
	}
	
	//static methods in interfaces are not inherited to other classes
	public static void feed(String food) {
		System.out.println("Feeding a pet with " + food);
	}
	

}
