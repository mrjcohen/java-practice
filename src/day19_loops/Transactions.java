package day19_loops;

import java.util.Scanner;

public class Transactions {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		double transaction = 0;
		double balance = 100;
		int transactionCount = 0;

		System.out.println("What is your balance?");
		balance = scan.nextDouble();
		
		while (balance > 0) {
			transactionCount++;
			System.out.println();
			System.out.println("What is transaction #"+transactionCount+" amount?");
			transaction = scan.nextDouble();
			balance -= transaction;
			
			
			if (balance < 0) {
				System.out.println();
				System.out.println("You have insufficient funds. Your balance after this transaction would be $" +balance);
				transactionCount--;
				System.out.println("You had " +transactionCount+ " successful transaction and 1 transaction that would overdraft your account");
			} else if (balance == 0){
				System.out.println("Your balance is $" + balance);
				System.out.println("You had " +transactionCount+ " successful transaction");
			} else {
				System.out.println("Your balance is $" + balance);
			}
			
			
			
		}

	
	}
}

//You have a balance
//and assign a value to the balance using scanner
//
//What is transaction amount?
//		
//transactions
//
//We keep doing transactions until we run out of balance
//
//100
//
//when out of money "You have insufficient funds, your balance is ..."