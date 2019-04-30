package day28_multid_arrays;

import java.util.Arrays;

public class Loop2DArrays {
	public static void main(String[] args) {
		String[][] pizzas = {{"pineapple","Pepperoni"},
							 {"anchovies","mushroom","olives"},
							 {"4 cheese"},
							 {"chicken","tomoatoes","japalenios","onions"},
							 {"green peppers","zuccini","brocolli","spinach","shrimp"}};
		
		//Prints all the arrays in the array using FOR EACH LOOP
		for (String[] pizza : pizzas) {
			System.out.print(pizza.length+"-");
			System.out.println(Arrays.toString(pizza));
		}
		
		//Prints all the arrays in the array using FOR LOOP	
		for (int i = 0 ; i < pizzas.length ; i++) {
			System.out.print(pizzas[i].length+"-");
			System.out.println(Arrays.toString(pizzas[i]));
		}
		
		//Print all values in the 3rd array
		for (String topping: pizzas[3]) {
			System.out.println(topping);
		}
		
		
		//FOR EACH LOOP
		//2 parts: outer loop, inner loop
		//outer loop will take each group
		//inner loop will take each value/student id
			
		
		int [][] students = {{4,5,6},
							{12,5,7},
							{23,56,12,55,3}};
				
		for (int[] group : students) {
			for (int studentId : group) {
				System.out.print(studentId+", ");
			}
			System.out.println();
		}
		
		
		
		//FOR LOOP
		//2 parts: outer loop, inner loop
		//outer loop will take each group
		//inner loop will take each value/student id
		
		
		
		int [][] nums = {{10,20},
						 {20,30,40,50},
						 {100,200,400},
						 {555,333,111,444,666,78}};
		
		for (int i = 0 ; i < nums.length ; i++) {
			for (int j = 0 ; j < nums[i].length ; j++) {
				System.out.print(nums[i][j]+", ");
			}
			System.out.println();
		}
		
						
		
	
		
		
		
		
		
		
		
	}
}
