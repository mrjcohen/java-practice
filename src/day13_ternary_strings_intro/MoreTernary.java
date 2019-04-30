package day13_ternary_strings_intro;

public class MoreTernary {
	public static void main(String[] args) {
		
		String quality = "good";
		
		int rating = quality.equals("good") ? 100 : 0;
		
		System.out.println("Rating: " +rating);
		
		
		int PMhour = 6;
		
		// Rush hour during evening: 4-7
		boolean rushHour = PMhour >= 4 && PMhour <= 7 ? true : false;
		
		System.out.println("Is it evening rush hour? " +rushHour);
		
		//String result = rushHour == true ? "yes" : "no";
		
		  String result = rushHour ? "yes" : "no";
		
		System.out.println("Is it evening rush hour? " +result);
		
		
		int AMhour = 8;
		
		//Rush hour during morning: 6-9
		String amRushHour = AMhour >= 6 && AMhour <= 9 ? "yes" : "no";
		
		System.out.println("Is it morning rush hour? " +amRushHour);
		
		
	}
}


