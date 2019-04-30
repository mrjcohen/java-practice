package day29_methods01;

import java.util.Arrays;

public class Countries {
	public static void main(String[] args) {

	  //String[][] countriesArray = new Sring[9][2];
		String[][] countriesArray = {{"USA"			,"Washington DC"	},  //0
									 {"Canada"		,"Ottawa"			},  //1
									 {"Mexico"		,"Mexico City"		},  //2
									 {"Brasil"		,"Rio de Janeiro"	},  //3
									 {"Peru"		,"Lima"				},  //4
									 {"Argentina"	,"Bueno Aires"		},  //5
									 {"Bolivia"		,"La Paz"			},  //6
									 {"Macedonia"	,"Scopia"			},  //7
									 {"Kazakhstan"	,"Nursultan"		}}; //8
									//0				//1
		
			//USA | Washington DC
			System.out.println(countriesArray[0][0]+" | "+countriesArray[0][1]);
			
			//Kazakhstan | Nursultan
			System.out.println(countriesArray[8][0]+" | "+countriesArray[8][1]);
			
			//[[USA, Washington DC], [Canada, Ottawa], [Mexico, Mexico City], [Brasil, Rio de Janeiro], [Peru, Lima], [Argentina, Bueno Aires], [Bolivia, La Paz], [Macedonia, Scopia], [Kazakhstan, Nursultan]]
			System.out.println(Arrays.deepToString(countriesArray));
			
			
			
			//Print all the countries in a row seperated by commas using FOR LOOP
			for (int i = 0 ; i < countriesArray.length ; i++) {
				System.out.print(countriesArray[i][0]+", ");
			}
			//OUTPUT: USA, Canada, Mexico, Brasil, Peru, Argentina, Bolivia, Macedonia, Kazakhstan,
			System.out.println();
			
			
			
			//Print all the countries in a row seperated by commas using FOR EACH LOOP
			for (String[] country : countriesArray) {
				System.out.print(country[0]+", ");
			}
			//OUTPUT: USA, Canada, Mexico, Brasil, Peru, Argentina, Bolivia, Macedonia, Kazakhstan,
			System.out.println();
			
			
			//get all the Cities and add to cities[] array and print the array
			String[] cities = new String[countriesArray.length];
			
			for (int i = 0 ; i < countriesArray.length ; i++) {
				cities[i] = countriesArray[i][1];
			}
			System.out.println(Arrays.toString(cities));
			
			
			//Look for bolivia. if its there return the capital
			for (int i = 0 ; i < countriesArray.length ; i++) {
				if (countriesArray[i][0].equalsIgnoreCase("Bolivia")) {
					//System.out.println(countriesArray[i][1]);
					if (countriesArray[i][1].equalsIgnoreCase("La Paz")) {
						System.out.println("Bolivia test passed");									
					} else {
						System.out.println("Bolivia test failed");
					}
					break; //leave loop as soon as bolivia is found and test is run
				}
			}
			
			
			
		}
}
