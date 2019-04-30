package day12_switch_ternary;

public class SwitchScore {
	public static void main(String[] args) {
		
		int score = 3;
		
		//	ELSE/IF STATEMENT 
		if (score == 1) {
			System.out.println("Score is 1");
		} else if (score == 2) {
			System.out.println("Score is 2");
		} else if (score == 3) {
			System.out.println("Score is 3");
		} else {
			System.out.println("Score is higher than 3");
		}
		
		
		//SWITCH STATEMENT
		switch (score) {
		case 1:
			System.out.println("Score is 1");
			break;								//break; is used to exit the switch statement
		case 2:
			System.out.println("Score is 2");
			break;
		case 3:
			System.out.println("Score is 3");
			break;
		default:								//default is like "else" in if/else
			System.out.println("Score is higher than 3");
		}
		
		
			
		
	}
}
