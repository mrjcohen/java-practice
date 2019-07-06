package day63_exceptions02;

public class CustomExceptionsTest {
	public static void main(String[] args) throws NeedSomeCoffeeException {
		
		double balance = 200;
		double transaction = 210;
		
		if (transaction > balance) {
			throw new UnsufficientFundsException("Your balance is low");
		} else {
			System.out.println("Purchase Successful");
			balance =- transaction;
		}
		
		throw new NeedSomeCoffeeException("getting sleepy");
		
	}
}
