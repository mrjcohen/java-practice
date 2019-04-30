package day27_arrays05;

import java.util.Arrays;

public class ArraysEquals {
	public static void main(String[] args) {
		
		//Comparing two int arrays with Arrays.equals
		int[] numsArr1 = {4,5,6,10,100};
		int[] numsArr2 = {4,5,6,10,100};
		
		boolean a = Arrays.equals(numsArr1,  numsArr2);
		System.out.println(a);
		
		
		if (Arrays.equals(numsArr1,  numsArr2)) {
			System.out.println("The arrays are exactly the same");
		} else {
			System.out.println("Mismatched values present");
		}
		
		
		//Comparing two int arrays with Arrays.equals
		String[] strArr1 = {"one","two","three"};
		String[] strArr2 = {"one","two","three"};
		System.out.println(Arrays.equals(strArr1,strArr2));
		
		boolean match = Arrays.equals(strArr1,strArr2);
		System.out.println("Is match?: " +match);
		
		
		
		
		
		
		
	}
}
