package day27_arrays05;

public class CanvasCourse {
	public static void main(String[] args) {
		//147 "Java Programming"
		//204 "Mentoring Sessions"
		//149 "SDLC"
		//152 "QA Testing"
		//144 "Team Activity"
		//143 "Welcome Kit"
		
		String url = "https://learn.cybertekschool.com/courses/204";
		
		String[] urlArr = url.split("/");
		
		int CourseID = Integer.parseInt(urlArr[urlArr.length - 1]);
		
		switch (CourseID) {
		case 147:
			System.out.println("Java Programming");
			break;
		case 204:
			System.out.println("Mentoring Sessions");
			break;
		case 149:
			System.out.println("SDLC");
			break;
		case 152:
			System.out.println("QA Testing");
			break;
		case 144:
			System.out.println("Team Activity");
			break;
		case 143:
			System.out.println("Welcome Kit");
			break;
		default:
			System.out.println("Invalid Course ID");
		}
		
		
	}
}
//Split string using "/" and get last array value
//Convert it to integer (Integer.parseInt(...) -> int value
//switch statement to find the match