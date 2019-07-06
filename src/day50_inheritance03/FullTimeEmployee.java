package day50_inheritance03;

public class FullTimeEmployee extends Employee{

	@Override
	public void calculatePay(int hours, double rate) {
		//should include 5% bonus
		double pay = (hours * rate) * 1.05;
		System.out.println("FullTimeEmployee total pay: " + pay);
	}
	
}
