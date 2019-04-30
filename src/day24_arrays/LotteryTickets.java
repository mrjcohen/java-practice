package day24_arrays;

import java.util.Arrays;

public class LotteryTickets {
	public static void main(String[] args) {
		int [] lotteryNumbers = {12, 45, 3, 62, 42, 90};
		System.out.println(Arrays.toString(lotteryNumbers));
		Arrays.sort(lotteryNumbers);
		System.out.println(Arrays.toString(lotteryNumbers));
		//If value is present in the array
		int index = Arrays.binarySearch(lotteryNumbers, 90);
		System.out.println(index);  //5
		//If value is not present in the array
		int index2 = Arrays.binarySearch(lotteryNumbers, 5);
		System.out.println(index2);  // returns negative number (-2)
	}
}
