package day09_stringequals_condtionals;

public class StringEquals {
	public static void main(String[] args) {
		
		String str1 = "java";
		String str2 = "java";
		String month = new String("March");
		String month2 = new String("March");
		
		
		//NOT RECOMMEDED METHOD (WHEN IT WORKS)
		System.out.println(str1 == str2);			//true
		System.out.println(str1 == "java");			//true
		System.out.println(str1 == "Java");			//false
		
		//RECOMMENDED (PREFERRED) METHOD
		System.out.println(str1.equals(str2));		//true
		System.out.println(str1.equals("java"));	//true
		System.out.println(str2.equals("Java"));	//false
		
		//NOT RECOMMEDED METHOD (WHEN IT DOESNT WORK)
		System.out.println(month == month2);		//false
		
		//RECOMMENDED (PREFERRED) METHOD
		System.out.println(month.equals(month2));	//true
		
		
		
		
		//ASSIGNING STRING 
		String today = "Tuesday";
		//ASSIGNING STRING WITH new Keyword
		String today1 = new String("Java");
		String str = new String("Hello");
	}

}
