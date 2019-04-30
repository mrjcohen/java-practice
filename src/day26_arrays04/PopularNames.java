package day26_arrays04;

import java.util.Arrays;
import java.util.Random;

public class PopularNames {
	public static void main(String[] args) {
		
		String[] names = {"James","Mary",
							"John","Patricia",
							"Robert","Jennifer",
							"Michael","Linda",
							"William","Elizabeth",
							"David","Barbara",
							"Richard","Susan",
							"Joseph","Jessica",
							"Thomas","Sarah",
							"Charles","Margaret",
							"Christopher","Karen",
							"Daniel","Nancy",
							"Matthew","Lisa",
							"Anthony","Betty",
							"Donald","Dorothy",
							"Mark","Sandra",
							"Paul","Ashley",
							"Steven","Kimberly",
							"Andrew","Donna",
							"Kenneth","Emily",
							"George","Carol",
							"Joshua","Michelle",
							"Kevin","Amanda",
							"Brian","Melissa",
							"Edward","Deborah",
							"Ronald","Stephanie",
							"Timothy","Rebecca",
							"Jason","Laura",
							"Jeffrey","Helen",
							"Ryan","Sharon",
							"Jacob","Cynthia",
							"Gary","Kathleen",
							"Nicholas","Amy",
							"Eric","Shirley",
							"Stephen","Angela",
							"Jonathan","Anna",
							"Larry","Ruth",
							"Justin","Brenda",
							"Scott","Pamela",
							"Brandon","Nicole",
							"Frank","Katherine",
							"Benjamin","Samantha",
							"Gregory","Christine",
							"Raymond","Catherine",
							"Samuel","Virginia",
							"Patrick","Debra",
							"Alexander","Rachel",
							"Jack","Janet",
							"Dennis","Emma",
							"Jerry","Carolyn",
							"Tyler","Maria",
							"Aaron","Heather",
							"Henry","Diane",
							"Jose","Julie",
							"Douglas","Joyce",
							"Peter","Evelyn",
							"Adam","Joan",
							"Nathan","Victoria",
							"Zachary","Kelly",
							"Walter","Christina",
							"Kyle","Lauren",
							"Harold","Frances",
							"Carl","Martha",
							"Jeremy","Judith",
							"Gerald","Cheryl",
							"Keith","Megan",
							"Roger","Andrea",
							"Arthur","Olivia",
							"Terry","Ann",
							"Lawrence","Jean",
							"Sean","Alice",
							"Christian","Jacqueline",
							"Ethan","Hannah",
							"Austin","Doris",
							"Joe","Kathryn",
							"Albert","Gloria",
							"Jesse","Teresa",
							"Willie","Sara",
							"Billy","Janice",
							"Bryan","Marie",
							"Bruce","Julia",
							"Noah","Grace",
							"Jordan","Judy",
							"Dylan","Theresa",
							"Ralph","Madison",
							"Roy","Beverly",
							"Alan","Denise",
							"Wayne","Marilyn",
							"Eugene","Amber",
							"Juan","Danielle",
							"Gabriel","Rose",
							"Louis","Brittany",
							"Russell","Diana",
							"Randy","Abigail",
							"Vincent","Natalie",
							"Philip","Jane",
							"Logan","Lori",
							"Bobby","Alexis",
							"Harry","Tiffany",
							"Johnny","Kayla"};
		
		//Print number of names in the array
		System.out.println("******************************");
		System.out.println(names.length);
		
		//Print all names in single line
		System.out.println("******************************");
		System.out.println(Arrays.toString(names));
		
		//Print in column format 2 names in each line
		System.out.println("******************************");
		for (int i = 0 ; i < names.length ; i+=2) {
			System.out.println(names[i]+", "+names[i+1]);
		}
		
		//Print all male names in the array(even) - MY METHOD
		System.out.println();
		System.out.println("******************************");
		System.out.println("Male Names");
		System.out.println("******************************");
		for (int i = 0 ; i < names.length ; i++ ) {
			if (i%2==0) {
				System.out.print(names[i]+", ");
			}	
		}
		
		//Print all male names in the array(even) - MURODIL'S METHOD
		System.out.println();
		System.out.println();
		System.out.println("******************************");
		System.out.println("Male Names");
		System.out.println("******************************");
		for (int i = 0 ; i < names.length ; i+=2 ) {
				System.out.print(names[i]+", ");	
		}
		
	
		//Print all female names in the array(odd) - MY METHOD
		System.out.println();
		System.out.println();
		System.out.println("******************************");
		System.out.println("Female Names");
		System.out.println("******************************");
		for (int i = 0 ; i < names.length ; i++ ) {
			if (i%2==1) {
				System.out.print(names[i]+", ");
			}	
		}
		
		//Print all female names in the array(odd) - MY METHOD
		System.out.println();
		System.out.println();
		System.out.println("******************************");
		System.out.println("Female Names");		
		System.out.println("******************************");
		for(int idx = 0; idx < names.length; idx++) {
			if(idx % 2 != 0) {
				if(idx == names.length -1) {			//THIS SECTION MAKES THE 
					System.out.print(names[idx]);		//LAST STRING IN THE ARRAY
				}else {									//NOT PRINT WITH A COMMA
					System.out.print(names[idx]+", ");	//WHEN IDX IS THE LAST VALUE IN THE ARRAY
				}
				
			}
		}
		
		//Print random name from the array
		System.out.println();
		System.out.println();
		System.out.println("******************************");
		System.out.println("Random Name");		
		System.out.println("******************************");
		Random random = new Random();
		int r = random.nextInt(names.length);
		System.out.println(names[r]);
		
		//Print all names that are up to 4 characters, in uppercase, in same line with for loop
		System.out.println();
		System.out.println();
		System.out.println("******************************");
		System.out.println("All 4 or less letter names - for loop");		
		System.out.println("******************************");
		for (int i = 0 ; i < names.length ; i++) {
			if (names[i].length() <= 4) {
				System.out.print(names[i].toUpperCase()+", ");
			}
		}
		
		
		
		//Print all names that are up to 4 characters, in uppercase, in same line with for loop Each Loop
		System.out.println();
		System.out.println();
		System.out.println("******************************");
		System.out.println("All 4 or less letter names - for each loop");		
		System.out.println("******************************");
		for (String singleName: names) {
			if (singleName.length() <= 4) {
				System.out.print(singleName.toUpperCase()+ ", ");
			}
		}
		
		//Add names that have the right number of characters
		System.out.println();
		System.out.println();
		System.out.println("******************************");
		System.out.println("All names with certain number of letters");		
		System.out.println("******************************");		
		String namesUpto4 = "";
		String names5to6 = "";
		String names7orMore = "";
		
		for (String singleName: names) {
			if (singleName.length() <= 4 ) {
				namesUpto4 += singleName+", ";
			} else if (singleName.length() >= 5 && singleName.length() <= 6) {
				names5to6 += singleName+", ";
			} else if (singleName.length() >= 7) {
				names7orMore += singleName+", ";
			}
		}
		
		System.out.println("NAMES UP TO 4: "+namesUpto4);
		System.out.println("NAMES 5 TO 6: "+names5to6);
		System.out.println("NAME MORE THAN 7: "+names7orMore);
		
		
		
		//Switch female to even and male to odd
		System.out.println();
		System.out.println();
		System.out.println("******************************");
		System.out.println("Switch names");		
		System.out.println("******************************");		
		
		System.out.println(Arrays.toString(names));
		
		String tempName;
		
		for (int i = 0 ; i < names.length ; i+=2) {
			tempName = names[i];
			names[i] = names[i+1];  
			names[i+1] = tempName;
		}
		System.out.println(Arrays.toString(names));
		
	}
}
