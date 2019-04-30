package day15_string_manipulation;

public class IndexOf {
	public static void main(String[] args) {
		
		String word1 = "github";

//If string is found
		System.out.println( word1.indexOf('g') );		//0	  ==> for single character you can use '  ' or "  "
		System.out.println( word1.indexOf("g") );		//0   ==> for single character you can use '  ' or "  "
		System.out.println( word1.indexOf("th") );		//2   ==> gives 2 because the t in th starts at 2
		System.out.println( word1.indexOf("hub") );		//3   ==> gives 3 because the h in hub starts at 3
		
//If string is not found		
		System.out.println( word1.indexOf("w") );		//-1  ==> gives -1 if not found
			
//You can assign indexOf() to an integer		
		String url = "www.okta.com";
		int i = url.indexOf(".");
		System.out.println(i);							//3

//You can us indexOf() in conjunction with charAt() to print characters in relation to a found indexOf 		
		System.out.println(url.charAt(i+1));			//o
		
		
//Find the spaces on either side of the dash ( - )		
		String title = "Java - Google Search";
		
		int dash = title.indexOf("-");
		
		System.out.println(title.charAt(dash-1));		//" "
		System.out.println(title.charAt(dash+1));		//" "
		
//Find the position of the word "States"
		String country = "United States of America";
		int states = country.indexOf("States");			
		System.out.println("Position of States"+" "+states);						//7
		
	
//Check if c++ is in the word two
		String word2 = "java, c++, python, tomcat, eclipse,";
		//With contains
		if (word2.contains("c++")) {
			System.out.println("c++ is there");
		} else {
			System.out.println("c++ is not there");
		}
		//with indexOf
		if (word2.indexOf("c++")  != -1) {
			System.out.println("c++ is there");
		} else {
			System.out.println("c++ is not there");
		}
	
		
		
	}

}
