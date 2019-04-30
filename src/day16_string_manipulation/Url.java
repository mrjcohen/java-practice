package day16_string_manipulation;

import java.util.Scanner;

public class Url {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the url");
		String url = scan.next();
		
// MURODIL'S CODE
		
		
		//check if www. is present
		if (url.startsWith("www.")) {
			System.out.println("www. is present");
		} else {
			System.out.println("Invalid url format");
			return;
		}
		
		//check if . is there right before extension (com)
		int dotIndex = url.length()-4;
		
		if (url.charAt(dotIndex) == '.') {
			System.out.println(". is there before extension");
		} else {
			System.out.println(". might be misplaced");
		}
		
		//output the domain name
		String domain = url.substring(4, dotIndex);
		System.out.println("Domain" +domain);
		
		//get the extension
		String extension = url.substring(dotIndex + 1 , url.length());
		System.out.println("Extension" +extension);
		
		
		
		
// MY CODE		
		
		/*  
		 
		//check if www. is present 
		if ((url.substring(0, 4)).contentEquals("www.")) {
			System.out.println("Yes, has www at the begining");
		}
		
		
		
		//check if . is there right before extension (com)
		if (url.charAt((url.lastIndexOf("com") - 1)) == '.') {
			System.out.println("Yes, has a period before .com");
		}
		
		
		//output the domain name
		I DID NOT FINISH
		
		//get the extension
		I DID NOT FINISH 
		  
		
		*/
		
		
		
		
		
			
		
				

		
		
		
	}

}
/*

String = www.amazon.com

1- Ensure string starts with www.
2- Check that it includes the ending dot, either (the . before .com)



*/