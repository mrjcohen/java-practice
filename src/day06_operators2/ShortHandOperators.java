package day06_operators2;

public class ShortHandOperators {
	
	public static void main(String[] args) {
		
		//Long hand assignment operators
		
		int students = 45;
		System.out.println("Students: " + students);
		
		students = students + 5;
		System.out.println("Students: " + students);
		
		
		students = students - 2;
		System.out.println("Students: " + students);
		
		
		
		//Short hand assignment operators
		
		int teachers = 10;
		System.out.println("Teachers: " + teachers);
		
		teachers += 2;
		System.out.println("Teachers: " + teachers);
		
		teachers -= 5;
		System.out.println("Teachers: " + teachers);
		
		
		
		int cars = 12;
		System.out.println("Cars: " + cars);
		
		cars *= 2;
		System.out.println("Cars: " + cars);   // cars = cars * 2;
		
		cars += cars;
		System.out.println("Cars: " + cars);
		
		
		
		
		int shoes = 20;
		System.out.println("Shoes: " + shoes); 
		
		shoes /= 4;
		System.out.println("Shoes: " + shoes); 
		
		
		
		double price = 45.50;
		int amount = 5;
		price += amount;
		System.out.println(price);
		
		
		
		int minutes = 66;
		minutes %= 60;
		System.out.println("Remaining: " + minutes);
		
		
		
		int pennies = 550;
		pennies %= 100;							//pennies = pennies % 100
		System.out.println("Pennies left: " + pennies);
		
		
		
		int count = 1;			//1
		count = count + 1;		//2
		count += 1;		    	//3
		count++;				//4
		
		System.out.println(count);
				
		
		
		
		
		
				
				
		
	}

}
