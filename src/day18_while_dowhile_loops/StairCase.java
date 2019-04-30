package day18_while_dowhile_loops;

public class StairCase {
	public static void main(String[] args) {

//		*
//		**
//		***
//		****
//		*****
//		******
//		*******
//		********
//		*********
//		**********

		// WITH A COUNTER
		int num = 1;
		String stairs = "";

		while (num <= 10) {

			stairs += '*';
			System.out.println(stairs);
			num++;

		}

		// BY CHECKING THE LENGTH
		String stars = "*";

		while (stars.length() <= 10) {

			System.out.println(stars);
			stars += "*";

		}

	}
}
