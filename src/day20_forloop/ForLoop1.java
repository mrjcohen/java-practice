package day20_forloop;

public class ForLoop1 {
	public static void main(String[] args) {
		
		//USING FOR LOOP PRINT "Love Java!" 10 TIMES 

		for ( int i = 1 ; i <= 5; i++) {
			
			System.out.println("Love Java!");
			
		}
		
		
		//PRINT NUMBER FROM 5 TO 15 USING A FOR LOOP
		
		for (int i = 5 ; i <= 15; i++) {
			System.out.print(i);			//56789101112131415
		}
		
		System.out.println();
		
		
		//PRINT NUMBER FROM 20 TO 10 USING A FOR LOOP
		
		for (int i = 20; i >= 10 ; i--) {
			System.out.print(i);			//2019181716151413121110
		}
		
		System.out.println();
		
		
		//PRINT THE LOWERCASE ALPHABET FROM a TO z
		
		for (char a = 97; a <= 122 ; a++) {
			System.out.print(a);			//abcdefghijklmnopqrstuvwxyz
		}
		
		System.out.println();
		
		
		//PRINT THE UPPERCASE ALPHABET FROM A TO Z
		
		for (char A = 65; A <= 90 ; A++) {
			System.out.print(A);			//ABCDEFGHIJKLMNOPQRSTUVWXYZ
		}
		
		
		
		
	}
}
