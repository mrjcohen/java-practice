package day27_arrays05;
import java.util.Scanner;

public class Times {
	public static void main(String[] args) {
		
		//hours 0 - 23
		//minutes 0 - 59
		
		Scanner scan = new Scanner(System.in);
		int[] time1 = new int[2];
		int [] time2 = new int[2];
		
		time1[0] = 10;	//Time1 Hours
		time1[1] = 15;	//Time1 Minutes
		time2[0] = 16;	//Time2 Hours
		time2[1] = 10;	//Time2 Minutes
		
		//Checking that time1 and time2 hours & minutes are valid
		if (time1[0] < 0 || time1[0] > 23) {
			System.out.println("Time1 has invalid hour");
			return;
		}
		if (time1[1] < 0 || time1[1] > 59) {
			System.out.println("Time1 has invalide minute");
			return;
		}
		if (time2[0] < 0 || time2[0] > 23) {
			System.out.println("Time2 has invalid hour");
			return;
		}
		if (time2[1] < 0 || time2[1] > 59) {
			System.out.println("Time2 has invalide minute");
			return;
		}
		//Checking which Time is earlier (time1 or time2)
		if (time1[0] > time2[0]) {
			System.out.println("Time2 is earlier");
		} else if ( time1[0] < time2[0]) {
			System.out.println("Time1 is earlier");
		} else if ( time1[0] == time2[0]) {
			if (time1[1] > time2[1]) {
				System.out.println("Time2 is earlier");
			} else if (time1[1] < time2[1]) {
				System.out.println("Time1 is earlier");
			} else if (time1[1] == time2[1]) {
				System.out.println("Time is the same");
			}
		}
		
		
		
	}
}
