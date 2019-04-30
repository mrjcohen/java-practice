package day33_methods05;

public class PayCalculator {
	public static int getHourlyPay(int hours, int rate) {
		if (hours <= 0) {
			System.out.println("Invalid Hours");
			return 0;
		} 
		
		if (rate <= 0) {
			System.out.println("Invalid rate");
			return 0;
		}
		
		int totalPay = (int) Calculator.multiply(rate, hours);
		return totalPay;
		
		
	}
	public static void main(String[] args) {
		int pay = getHourlyPay(40, 50);
		System.out.println("Total pay for 40 hours is: "+pay);
		int noPay = getHourlyPay(10, 0);
		System.out.println("noPay: " + noPay);
	}
}
