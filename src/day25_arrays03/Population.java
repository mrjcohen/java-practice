package day25_arrays03;

public class Population {
	public static void main(String[] args) {
		int [] population = new int[5];
		population[0] = 5000;
		population[1] = 10000;
		population[2] = 7000;
		population[3] = 4455;
		population[4] = 8907;
		
		for (int i = 0 ; i < 5 ; i++) {
			System.out.println("City "+(i+1)+ " Population: " +population[i]);
		}		
//		City 1 Population: 5000
//		City 2 Population: 10000
//		City 3 Population: 7000
//		City 4 Population: 4455
//		City 5 Population: 8907
		
		
		String str = "abc";
		System.out.println("City "+str.length()+ " Population: " +population[str.length()]);
		//City 3 Population: 4455
		
		
		String[] cities = {"Miami","London","Tokyo","Rome","New York"};
		
		//city index = population index
		System.out.println("Population of " +cities[0]+ " is "+ population[0]);
		System.out.println("Population of " +cities[1]+ " is "+ population[1]);
		System.out.println("Population of " +cities[2]+ " is "+ population[2]);
		System.out.println("Population of " +cities[3]+ " is "+ population[3]);
		System.out.println("Population of " +cities[4]+ " is "+ population[4]);
//		Population of Miami is 5000
//		Population of London is 10000
//		Population of Tokyo is 7000
//		Population of Rome is 4455
//		Population of New York is 8907
		
		
		
	}
}
