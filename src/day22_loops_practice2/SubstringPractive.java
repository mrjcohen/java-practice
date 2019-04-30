package day22_loops_practice2;

public class SubstringPractive {
	public static void main(String[] args) {
		
		System.out.println("################");
		//print each character of word on a separate line using substring
		String word = "java";
		System.out.println(word.substring(0,1));
		System.out.println(word.substring(1,2));
		System.out.println(word.substring(2,3));
		System.out.println(word.substring(3,4));
		
		
		System.out.println("################");
		//print each character of word on a separate line using substring with a variable
		
		int i = 0;
		System.out.println(word.substring(i,i+1));
		i++;
		System.out.println(word.substring(i,i+1));
		i++;
		System.out.println(word.substring(i,i+1));
		i++;
		System.out.println(word.substring(i,i+1));
		
		
		
		System.out.println("################");
		//print each character of word on a separate line using substring with a for loop
		
		for (int n = 0 ; n <= 3 ; n++) {
			
			System.out.println(word.substring(n,n+1));
			
		}
		
		
		System.out.println("################");
		//print each character IN REVERSE of word on a separate line using substring with a for loop
		
		for (int n = 3 ; n >= 0 ; n--) {
			
			System.out.println(word.substring(n,n+1));
			
		}
		
		
		System.out.println("################");
		
		
		int start = 1;
		int end = 5;
		String word2 = "UnitedStates";
		System.out.println(word2.substring(start, end));	//nite
		

	}
}


/*


*/
