package day63_exceptions02;



public class NeedSomeCoffeeException extends Exception{
	
	public NeedSomeCoffeeException() {
		
	}
	
	public NeedSomeCoffeeException(String message) {
		super(message);
	}

}
