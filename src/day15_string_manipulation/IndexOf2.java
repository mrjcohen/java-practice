package day15_string_manipulation;

public class IndexOf2 {
	public static void main(String[] args) {
		
		String list = "html-selenium-angular-jenkins-grid";
		
		//indexOf with 2 inputs
		
		int firstDash = list.indexOf("-");
		System.out.println("First dash " +firstDash);		//"First dash 4"
		
		int secondDash = list.indexOf("-" , firstDash+1);	//Look for dash by searching from the 5th index
		System.out.println("Second dash " +secondDash);		//"Second dash 13"
		
		int thirdDash =  list.indexOf("-" , secondDash+1);	//Look for dash by searching from the 14th index (secondDash+1)
		System.out.println("Third dash " +thirdDash);		//"Second dash 21"
		
		int lastDash = list.lastIndexOf("-");
		System.out.println("Last dash " +lastDash); 		//"Last dash 29"
		
	
		
		
	}
}
