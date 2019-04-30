package day20_forloop;

public class IndexOf {
public static void main(String[] args) {
				// 012345
	String word = "amazon";
	char letter = 'm';
	int index = -1;   //initialize to -1 in case the letter is not found. 
	
	//USING FOR LOOP, LOOK FOR (SEARCH) THE LETTER
	//IF IT IS A MATCH ASSIGN VALUE TO INDEX
	//EXIT FOR LOOP
	//PRINT VALUE OF INDEX
	
	
	for (int i = 0 ; i < word.length() ; i++) {
		
		if (word.charAt(i) == letter) {
			index = i;
			break;							//will exit the loop after the index is found
		}
		
	}
	
	System.out.println("Index: "+index);
	
	
}
}
