package day12_switch_ternary;

public class OrLogicWithSwitch {
	public static void main(String[] args) {
		
		char grade = 'B';
		
		//A, B, C => PASS		D, E, => FAIL		ALL OTHERS => INVALID GRADE
		
		
		switch (grade) {
			case 'A':
			case 'B':
			case 'C':
				System.out.println("PASS");
			case 'D':
			case 'E':
				System.out.println("FAIL");
			default: 
				System.out.println("INVALID GRADE");
		}
		
	}

}
