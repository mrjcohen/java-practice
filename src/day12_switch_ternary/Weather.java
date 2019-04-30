package day12_switch_ternary;

import java.util.Scanner;

public class Weather {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter weather: sunny, hot, windy, rainy, or snow");
		String weather = scan.next();
		
		
		switch (weather) {
		case "sunny":
			System.out.println("Go to park");
			System.out.println("Code Java");
			break;
		case "hot":
			System.out.println("Go Swimming");
			System.out.println("Code Java");
			break;
		case "windy":
			System.out.println("Fly a kite");
			System.out.println("Code Java");
			break;
		case "rainy":
			System.out.println("Go shopping");
			System.out.println("Code Java");
			break;
		case "snow":
			System.out.println("Chain your tires");
			System.out.println("Go skiing");
			System.out.println("Code Java");
			break;
		default:
			System.out.println("Code Java in any other wather");
		}
	
		
	}
}
