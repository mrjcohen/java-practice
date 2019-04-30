package day27_arrays05;
import java.util.Arrays;

public class ArraysClass {
	public static void main(String[] args) {
		
		//toString method
		int[] nums = {42, 12, 4, 1, 3, 5};
		System.out.println(Arrays.toString(nums));
		String str = Arrays.toString(nums);
		System.out.println(str);
		
		//sort method - numbers
		Arrays.sort(nums);
		System.out.println(Arrays.toString(nums));
		
		//sort method - Strings
		String[] languages = {"Zulu","Spanish","Italian","English","Polish","Arabic","Uzbek"};
		System.out.println(Arrays.toString(languages));
		Arrays.sort(languages);		
		System.out.println(Arrays.toString(languages));
		
		int[] nums2 = {345, 665, 3333, 11, 3, 66};
		Arrays.sort(nums2);
		//lowest value
		int lowest = nums2[0];
		//largest value
		int highest = nums2[nums2.length-1];
		
		System.out.println("Lowest number: "+lowest);
		System.out.println("Highest number: "+highest);
		
		
		
	}

}
