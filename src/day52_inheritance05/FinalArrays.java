package day52_inheritance05;

import java.util.Arrays;

public class FinalArrays {
	public static void main(String[] args) {
		
		final int[] TEAMS = new int[] {11,11};
		
		System.out.println("Team1 : " + TEAMS[0]);
		System.out.println("Team2 : " + TEAMS[1]);
		
		//values in a final array can be changed
		TEAMS[0] = 10;
		TEAMS[1] = 9;
		
		System.out.println("Team1 : " + TEAMS[0]);
		System.out.println("Team2 : " + TEAMS[1]);
		
		//final arrays dont allow for the values to be re-assigned to a new array 
		//TEAMS = new int[] {10,10,10};
		
		//Non final arrays allow for the creating of a new array object with same name
		int[] nums = new int[] {23,55,355};
		System.out.println(Arrays.toString(nums));
		nums = new int[] {213,213,234,345};
		System.out.println(Arrays.toString(nums));
		
		
		final int[] finalNums = {23,66,44,11};
		System.out.println(Arrays.toString(finalNums));
		finalNums[0] = 2345;
		final int i = 100;
		finalNums[1] = i;
		finalNums[1] = 10;
		System.out.println(Arrays.toString(finalNums));
		//is final so cant create a new array object 
		//finalNums = new int[] {12,23,45,76,43};
		
		final double[] PRICES = new double[3];
		PRICES[0] = 85.5;
		PRICES[1] = 99.99;
		PRICES[2] = 99.98;
		System.out.println(Arrays.toString(PRICES));
		//You can change values in a final array
		PRICES[0] = 81.1;
		
		//Band new object in the array is not allowed since PRICES is final. Even if you try creating one with the same length
		//PRICES = new double[3];		
		
		
	}
}
