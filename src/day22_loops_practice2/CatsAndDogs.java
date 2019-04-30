package day22_loops_practice2;

public class CatsAndDogs {
	public static void main(String[] args) {
		
		String str = "mycatyourcat";
		int count = 0;
		
		for (int i = 0 ; i <= str.length() - 3 ; i++) {
			
			if (str.substring(i, i+3).equals("cat")) {
				count++;
			}
		}
		
		System.out.println(count);
		
		
	}

}
