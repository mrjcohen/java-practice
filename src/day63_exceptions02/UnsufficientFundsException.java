package day63_exceptions02;

public class UnsufficientFundsException extends RuntimeException {
	
	public UnsufficientFundsException() {
		//empty constructor
	}

	public UnsufficientFundsException(String message) {
		super(message);
	}
}
