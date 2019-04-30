package day15_string_manipulation;

public class StartsEndsWith {
	public static void main(String[] args) {
		
		String word1 = "eclipse";
		
		//startsWith
		System.out.println(word1.startsWith("e"));					//true
		System.out.println(word1.startsWith("ec")); 				//true
		System.out.println(word1.startsWith("eclip")); 				//true
		System.out.println(word1.startsWith("eclipse")); 			//true
		
		System.out.println(word1.startsWith("Ec")); 				//false ==> startsWith is CASE SENSITIVE
		
		
		//endsWith
		System.out.println(word1.endsWith("pse"));  				//true
		
		
		//Making endsWith not case sensitive
		System.out.println(word1.toUpperCase().endsWith("PSE"));	//true
		
		
		
		
		
		String word2 = "Mr. Jackson";
		
		// Mr.  ==> male
		// Mrs. ==> married woman
		// Ms.  ==> some woman
		// Dr.  ==> Doctor man or woman
		//      ==> unknown status
		
		if (word2.startsWith("Mr.")) {
			System.out.println("male");
		} else if (word2.startsWith("Mrs.")) {
			System.out.println("married woman");
		} else if (word2.startsWith("Ms.")) {
			System.out.println("some woman");
		} else if (word2.startsWith("Dr.")) {
			System.out.println("doctor man or woman");
		} else {
			System.out.println("unknown status");
		}
		
		
	
		
		
	}
}
