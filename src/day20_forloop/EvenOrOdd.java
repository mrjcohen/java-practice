package day20_forloop;

public class EvenOrOdd {
	public static void main(String[] args) {
	
	//USING FOR LOOP PRINT 1-100
	//PRINT ALL EVEN NUMBERS IN THE SAME LINE
		
//MY METHOD
		for (int i = 2 ; i <= 100 ; i+=2) {
			
			System.out.print(i+" ");
			
		}
		
		System.out.println();
				
//MURODILS METHOD
		for (int i = 1 ; i <= 100 ; i++) {
			
			if (i % 2 == 0) {
				
				System.out.print(i+" ");
				
			}
			
		}
		
		System.out.println();
		
		
		
		
		
		
	//USING FOR LOOP PRINT 1-100
	//PRINT ALL ODD NUMBERS IN THE SAME LINE

//MY METHOD
		for (int i = 1 ; i <= 100 ; i++) {
			
			if (i % 2 == 1) {
				
				System.out.print(i+" ");
				
			}
			
		}
	
		System.out.println();
		
	
//MURODILS METHOD	
		for (int i = 1 ; i <= 100 ; i++) {
			
			if (i % 2 != 0) {
				
				System.out.print(i+" ");
				
			}
			
		}
	
		System.out.println();
		
		
		
		
		
		
		
	//USING FOR LOOP PRINT 1-100
	//SUM OF ODD AND SUM OF EVENS
	//PRINT OUTSIDE THE LOOP
	
//MY METHOD
		int sumOfEvens = 0;
		int sumOfOdds = 0;
		
		for (int i = 1 ; i <= 100 ; i++) {
			
			if (i % 2 == 0) {
				sumOfEvens = sumOfEvens + i;
			}
			
			if (i % 2 == 1) {
				sumOfOdds = sumOfOdds + i;
			}
			
		}
		
		System.out.println("Sum of even number: "+sumOfEvens);
		System.out.println("Sum of odd number: "+sumOfOdds);
	
		
//MURODILS METHOD
		int sumOfEven = 0;
		int sumOfOdd = 0;
		
		for (int i = 1 ; i <= 100 ; i++) {
			
			if (i % 2 == 0) {
				sumOfEven = sumOfEven + i;
			} else {							// else-if or if condition not needed since all remaining numbers will be odd
				sumOfOdd = sumOfOdd + i;
			}
			
		}
		
		System.out.println("Sum of even number: "+sumOfEven);
		System.out.println("Sum of odd number: "+sumOfOdd);
		
		
		
		
		
		
	}
}
