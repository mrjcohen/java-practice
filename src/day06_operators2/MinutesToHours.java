package day06_operators2;

public class MinutesToHours {
	
	public static void main(String[] args) {
		
		// My method - using minutes1 because Murodil is using minutes2 in his method
		
		int minutes1 = 125;
		
		System.out.println( (minutes1 / 60) + " hours and " + (minutes1 % 60) + " minutes");
		
		
		
		
		
		// Murodil's method - using minutes2 because I am using minutes1 in my method
	
		int minutes2 = 125;
		int hours = minutes2 / 60;
		int remainingMinutes = minutes2 % 60;
		
		
		System.out.println(hours+ " hours and " +remainingMinutes+ " minutes");
		
		
		
		
		
		
	}

}
