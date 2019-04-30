package day07_scanner_operator;

public class PreAndPostIncrement {

	public static void main(String[] args) {
		
		int num = 0;
		int num2 = num++;					//(post-increment) value of num gets assigned to num2 before 1 is added to num
											//pass value of num to num2 BEFORE adding +1 
		
		System.out.println("num: "+num);	//=1
		System.out.println("num2: "+num2);	//=0
		
		
		
		int n = 0;
		int n2 = ++n;						//(pre-increment) value of n gets assigned to itself after +1 and then also to n2
											//Pass value of n to n2 AFTER adding 1
		
		System.out.println("n: "+n);		//=1
		System.out.println("n2: "+n2);		//=1
		
		
		
		int i = 10;
		i++;								// without being a variable to be assigned it is (+1). (in this situation i++ and ++i do the same thing)
		++i;								// without being a variable to be assigned it is (+1). (in this situation i++ and ++i do the same thing)
		System.out.println("i: "+i);
	
	
		
		
		int bananas = 6;							//bananas 6
		
		System.out.println("bananas: "+bananas);
		
		
		int pears = bananas++;						//pears 6 and bananas 7
		
		System.out.println("bananas: "+bananas);
		System.out.println("pears: " + pears);
		
		
		int apples = ++bananas;						//apples 8 and bananas 8
		
		System.out.println("bananas: "+bananas);
		System.out.println("apples: " + apples);
		
		
		
		int friends = 10;
		System.out.println("friends "+friends++);	//10
		System.out.println("friends "+friends);		//11
		
		int chairs = 10;
		System.out.println("chairs "+chairs);		//11
		System.out.println("chairs "+chairs);		//11
		
		
		int p1 = 10;								
		int sum = p1++ + 5;
		
		System.out.println("p1: " +p1);				//p1 = 11
		System.out.println("sum: " +sum);			//sum = 15
		
		
		int batteries = 8;
		int oldBatteries = 5;
		
		int totalBatteries = batteries++ + ++oldBatteries;
				//14           8         +         6
		
		
		System.out.println(batteries);				//9
		System.out.println(oldBatteries);			//6
		System.out.println(totalBatteries);			//14
		
		
		
		

	
	}
	
}
