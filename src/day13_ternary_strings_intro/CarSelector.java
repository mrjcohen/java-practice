package day13_ternary_strings_intro;

import java.util.Scanner;

public class CarSelector {
	public static void main(String[] args) {
		
		// 1)American: Ford, Dodge, Tesla, Chevrolet, Lincoln
		// Average Price: 33000
		
		// 2)Japanese: Toyota, Mitsubishi, Honda, Subaru, Mazda
		// Average Price: 32000
		
		// 3)German: BMW, VW, Audi, Mercedes, Porsche
		// Average Price: 45000
		
		// 4)Italian: Alfa Romeo, Ferrari, Lamborghini, Fiat
		// Average Price:  85000
		
		//5)Korean: Kia, Hyundai, Daewoo
		//Average Price: 25000
		
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Which type of car are you interested in?");
		System.out.println(" 1) American\n 2) Japanese\n 3) German\n 4) Italian\n 5) Korean");
		
		
		int carType = scan.nextInt();

		double averagePrice = 0;
		String carOptions = "", carOrigin = "";
		
		
		switch (carType) {
		case 1:
			averagePrice = 33000;
			carOptions = "Ford, Dodge, Tesla, Chevrolet, Lincoln";
			carOrigin = "American";
			break;
		case 2:
			averagePrice = 32000;
			carOptions = "Toyota, Mitsubishi, Honda, Subaru, Mazda";
			carOrigin = "Japanese";
			break;	
		case 3:
			averagePrice = 45000;
			carOptions = "BMW, VW, Audi, Mercedes, Porsche";
			carOrigin = "German";
			break;	
		case 4:
			averagePrice = 85000;
			carOptions = "Alfa Romeo, Ferrari, Lamborghini, Fiat";
			carOrigin = "Italian";
			break;	
		case 5:
			averagePrice = 25000;
			carOptions = "Kia, Hyundai, Daewoo";
			carOrigin = "Korean";
			break;	
		default:
			System.out.println("You did not select a valid number. Input a number from 1-5.");
			return;
				
		}
		
		System.out.println("You selected "+carOrigin+ " cars and your options are " +carOptions);
		System.out.println("Average price " +averagePrice);
		
		
		
		
	}

}
