package day50_inheritance03;

public class Contractor extends Employee {

	@Override
	public void calculatePay(int hours, double rate) {
		//gets extra 200$ for each pay
		double pay = (hours * rate) + 200;
		System.out.println("Contractor total pay: " + pay);
	}
	
}
