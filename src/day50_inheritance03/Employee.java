package day50_inheritance03;

public class Employee {
	
	public void calculatePay(int hours, double rate) {
		double pay = (hours * rate);
		System.out.println("Employee total pay: " + pay);
	}
	
}
