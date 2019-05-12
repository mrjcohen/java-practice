package day41_customclasses02;

public class CapitalOne {
	public static void main(String[] args) {
		BankAccount user = new BankAccount();
		
		user.accountHolder = "Bill Gates";
		user.accountNumber = 12345;
		user.deposit(250);
		user.withdraw(100);
		user.charge(50, "shoes");;
		
		
		
	}
}
