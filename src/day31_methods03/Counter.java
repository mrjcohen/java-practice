package day31_methods03;

public class Counter {
	public static void countUp(int num) {
		//count from 1 to num
		//value less than 1 is "invalid input"
		if (num < 1) {
			System.out.println("invalid input");
		} else {
			for (int i = 1 ; i <= num ; i++) {
				System.out.println(i);
			}
		}
	}
	public static void countDown(int num) {
		//count down from num to 1
		//value is "invalid input" if num is 0 or less
		if (num < 1) {
			System.out.println("invalid input");
		} else {
			while (num > 0) {
				System.out.println(num);
				num--;
			}
		}
	}
	public static void main(String[] args) {
		
		countUp(5);
		countUp(0);
		countDown(5);
		countDown(0);
		
	}
}
