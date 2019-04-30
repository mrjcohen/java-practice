package day15_string_manipulation;

import java.util.Scanner;

public class Emoji {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String emoji = scan.next();
		
//Morodil's Method		
		
		if (emoji.length() != 2) {
		
			System.out.println("Invalid Emoji");
			return;
		
		}
		
		
		char first = emoji.charAt(0);
		char second = emoji.charAt(1);
		
		
		if (first == ':') {
			
			
			if (second == ')') {
				System.out.println("Smile");
			} else if (second == '(') {
				System.out.println("Sad");
			} else if (second == '/') {
				System.out.println("Upset");
			} else if (second == 'p') {
				System.out.println("Playful");
			} else {
				System.out.println("Unknown Emoji");
			}
			
			
		} else if (first == ';') {
			
			
			if (second == ')') {
				System.out.println("Wink");
			} else if (second == '0') {
				System.out.println("Surprise");
			} else {
				System.out.println("Unknown Emoji");
			}
			
			
		} else if (first == '(') {
			
			
			if (second == ':') {
				System.out.println("Smile");
			} else {
				System.out.println("Unkown Emoji");
			}
			
			
		} else if (first == ')') {
			
			if (second == ':') {
				System.out.println("Sad");
			} else {
				System.out.println("Unkown Emoji");
			}
			
			
		} else {
			
			System.out.println("Invalid Emoji");
			
		}
		
		
		
		
		
		
/*
 * 
 
//My Method
 		
		if (emoji.charAt(0) == ';' && emoji.length() == 2) {
			
			
			
				if (emoji.charAt(1) == ')') {
				
					System.out.println("Smile");
				
				} else if (emoji.charAt(1) == '(') {
				
					System.out.println("Sad");
				
				} else if (emoji.charAt(1) == '/') {
				
					System.out.println("upset");
				
				} else if (emoji.charAt(1) == 'p') {
				
					System.out.println("playful");
				}
		
			
		} else if (emoji.charAt(0) == ':' && emoji.length() == 2) {
				
			
			
				if (emoji.charAt(1) == ')') {
					
					System.out.println("Smile");
					
				} else if (emoji.charAt(1) == '(') {
					
					System.out.println("Sad");
					
				} else if (emoji.charAt(1) == '/') {
					
					System.out.println("upset");
					
				} else if (emoji.charAt(1) == 'p') {
					
					System.out.println("playful");
					
				} 
				
		
				
		} else {
			
			System.out.println("Invalid Emoji");
			return;
		}
		
				
		
				
*/
		
				
				
		
				
				
				
				
	}
}

/*

;) ==> smile
:( ==> sad
:/ ==> upset
:p ==> playful

;) ==> wink
;0 ==> surprised

(: ==> smile
): ==> sad

psuedocode:

 - Check first char
 	; or : else invalid Character
 - Then check second character
 if ) then smile
 if ( then sad
 if / then upset
 if p then playful
 
 - if not two characters
 "Invalid emoji"
 and end code
 

*/
