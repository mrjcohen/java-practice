package day18_while_dowhile_loops;

public class Alphabet {
	public static void main(String[] args) {
		
//		char letter = 'a';
//		
//		System.out.println(letter);	//a
//		letter++;
//		System.out.println(letter);	//b
//		letter++;
//		System.out.println(letter);	//c
//		letter++;
//		System.out.println(letter);	//d
//		letter++;
		
	
		
		char letter = 'a';
		
		while (letter <= 'z') {
			
			System.out.print(letter+" ");  //a b c d e f g h i j k l m n o p q r s t u v w x y z 
			letter++;
			
		}
		
		
		System.out.println(); 				//Adding new line between lowercase and uppercase alphabet
		
		
		char capitals = 'A';
		
		while (capitals <= 'Z') {
			
			System.out.print(capitals+" ");  //A B C D E F G H I J K L M N O P Q R S T U V W X Y Z 
			capitals++;
			
		}
		

		System.out.println();				//Adding new line
		
		
		char reverse = 'z';
		
		while (reverse >= 'a') {
			
			System.out.print(reverse+" ");  //z y x w v u t s r q p o n m l k j i h g f e d c b a 
			reverse--;
			
		}
		
		
		System.out.println();				//Adding new line 
		
		
		
		
//		A
//		AB
//		ABC
//		ABCD
//		ABCDE
//		ABDCEF
//		ABDCEFG
		
		
//		String letters = "";
//		letters = letters + 'A';
//		System.out.println(letters);	//A
//		
//
//		letters = letters + 'B';
//		System.out.println(letters);	//AB
//		
//		letters = letters + 'C';
//		System.out.println(letters);	//ABC
		
		
		String letters = "";
		char myLetter = 'A';
		
		while(myLetter <= 'Z') {
			letters = letters + myLetter;
			System.out.println(letters);
			myLetter++;
		}
			
		
	
	
		
		
		
		
		
		
		
		
		
		
	}
}
