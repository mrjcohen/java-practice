package day16_string_manipulation;

public class IsEmpty {
	public static void main(String[] args) {

		String username = "";
		String password = "";

		System.out.println(username.isEmpty()); // true

		username = " ";

		System.out.println(username.isEmpty()); // false

		username = "";

		if (username.isEmpty()) {
			System.out.println("Username field cannot be empty"); // true
		} else {
			System.out.println("Username is not empty");
		}

		if (username.isEmpty() || password.isEmpty()) {
			System.out.println("Username and password cannot be empty");
		} else {
			System.out.println("Username and password is not empty");
		}
		
		
		if (username.length() == 0) {
			System.out.println("Username length is 0, so it is empty");
		}

	}

}
