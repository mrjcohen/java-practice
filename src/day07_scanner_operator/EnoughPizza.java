package day07_scanner_operator;

public class EnoughPizza {
	public static void main(String[] args) {
		
		int pizzaCount = 30;		//8 slices per pizza (pizzaCount)
		int studentCount = 145;
		boolean isEnoughPizza;
		
		
		
		System.out.println(((pizzaCount * 8) / studentCount) >= 2);
		
		
		isEnoughPizza = (((pizzaCount * 8) / studentCount) >= 2);
		
		System.out.println("Is there enough pizza for each student to have two slices? " + isEnoughPizza);
		
		
		
	}

}
