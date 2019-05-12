package day41_customclasses02;

public class BankAccount {
	double balance;
	String accountHolder;
	int accountNumber;
	
	public void deposit(double amount) {
		System.out.println("Depositing $" + amount + " to " + accountNumber);
		balance += amount;
		showBalance();
	}
	
	public void withdraw(double amount) {
		System.out.println("Withdrawing $" + amount + " from " + accountNumber);
		balance -= amount;
		if (balance < 0) {
			balance -= 35;
		}
		showBalance();
	}
	
	public void showBalance() {
		System.out.println("==================================");
		System.out.println("Account Holder: " + accountHolder);
		System.out.println("Account Number: " + accountNumber);
		System.out.println("Balance: $" + balance);
		System.out.println("==================================");
	}
	
	public void charge(double price, String item) {
		if (price <= balance) {
			System.out.println("Transaction approved in the amount $" + price + " for " + item);
			balance -= price;
		} else {
			System.out.println("You do not sufficent funds to purchase " +item);
		}
		showBalance();
	}
	
}
