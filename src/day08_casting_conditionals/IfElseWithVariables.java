package day08_casting_conditionals;

public class IfElseWithVariables {
	public static void main(String[] args) {
		
		int temperature = 45;
		
		
		if ( temperature >= 65) {
			System.out.println("Its a nice day");
		} else {
			System.out.println("Its cold outside");
		}
		
		
		//two integer variables
		//put a condition. Check if team A won
		//		if A team won
		//			output: "Team A won"
		//  	  			"Go to Team A"
		//		else 
		//			output:	"team b won or it was a draw"
		//     				"Go Teams!"
		
		
		int teamAScore, teamBScore;
		teamAScore = 5;
		teamBScore = 5;
		
		
		if (teamAScore > teamBScore) {
			System.out.println("Team A won \nGo to Team A!");
		} else {
			System.out.println("team b won or it was a draw \nGo Teams!");
		}
		
		
		
	}

}
