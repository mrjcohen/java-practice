package day27_arrays05;

import java.util.Arrays;

public class CopyOf {
	public static void main(String[] args) {
		double[] d1 = {2.3,4.5,12.4};
		double[] d2 = d1;
		System.out.println(Arrays.toString(d1));
		System.out.println(Arrays.toString(d2));
		
		d1[0] = 1000.3;	//since double[] d2 = d1; is pointing to the same heap, this changes d1 and d2
		System.out.println(Arrays.toString(d1));
		System.out.println(Arrays.toString(d2));
	
		double[] d3 = Arrays.copyOf(d2, d2.length); //this creates array d3 in new heap location
		System.out.println(Arrays.toString(d3));
		
		d2[0] = 1;
		System.out.println(Arrays.toString(d1)); //[1.0, 4.5, 12.4]
		System.out.println(Arrays.toString(d2)); //[1.0, 4.5, 12.4]
		System.out.println(Arrays.toString(d3)); //[1000.3, 4.5, 12.4]
	}
}
