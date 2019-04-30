package day28_multid_arrays;

import java.util.Arrays;

public class FootballTeams {
	public static void main(String[] args) {
		String[][] teams = new String[2][6];
		teams[0][0] = "Irina";
		teams[0][1] = "Zarif";
		teams[0][2] = "Cihan";
		teams[0][3] = "Habib";
		teams[0][4] = "Adel";
		teams[0][5] = "Bojan";
		
		teams[1][0] = "Olimjon";
		teams[1][1] = "Mirshod";
		teams[1][2] = "Usman";
		teams[1][3] = "Nursultan";
		teams[1][4] = "Roman";
		teams[1][5] = "Dmitriy";
		
		System.out.println("First Play of first team: ");
		System.out.println(teams[0][0]); //Irina
		System.out.println(teams[0][3]); //Habib
		System.out.println(teams[1][5]); //Dmitriy
		
		//Print how many rows (teams) 
		System.out.println(teams.length); //2
		//Print how many (values in the first array) people in 1st team
		System.out.println(teams[0].length); //6
		//Print how many (values in the first array) people in 2nd team
		System.out.println(teams[1].length); //6
		
		System.out.println(Arrays.deepToString(teams));
		
		
		
		int[][] nums = new int[3][4];
		
		nums[0][0] = 100;
		nums[0][1] = 34534;
		nums[0][2] = 343242;
		nums[0][3] = 77242;
		
		nums[1][0] = 256;
		nums[1][1] = 64546;
		nums[1][2] = 257776;
		nums[1][3] = 999776;
		
		nums[2][0] = 1256;
		nums[2][1] = 164546;
		nums[2][2] = 1257776;
		nums[2][3] = 1999776;
		
		System.out.println(Arrays.deepToString(nums));
		System.out.println(Arrays.toString(nums[0]));
		
		
		int[][] scores = { {3,5,10} , {6,4,2,10} };
		
		System.out.println("Days played/Number of arrays: "+scores.length); //2
		System.out.println("Number of values in 1: "+scores[0].length);		//3
		System.out.println("Number of values in 2: "+scores[1].length );	//4
		
		
		
		
		int[][] values = new int[4][];
		values[0] = new int[] {34,23,5}; //Assigning values to the first array
		values[1] = new int[2]; // assigning 2 empty values to the second array
		values[1][0] = 45; // assigning value to the 1st slot in the second array
		values[1][1] = 32; // assigning value to the 2nd slot in the second array
		
		
		
		
		
	}
}
