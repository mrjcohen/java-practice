package day36_wrapperclasses_arraylistintro;

public class Boxing {
	public static void main(String[] args) {
		
		//AUTOBOXING - converting a primitive into an object is called autoboxing
		Integer num1 = 1234;
		int n = 5;
		Integer num2 = n;
		
		double d1 = 33.2;
		Double d2 = d1;
		Double d3 = 4.3;
		
		//UNBOXING - convert object into a primitive
		Boolean b1 = new Boolean(true);
		boolean b2 = b1;
		
		Double dl1 = new Double(34.2);
		double dl2 = dl1;
		System.out.println(dl1);
		System.out.println(dl2);
		
		long l1 = new Long(6000000); //UNBOXING
		Long l2 = new Long(23432443L); //NO BOXING - JUST CREATING A WRAPPER OBJECT
		long l3 = l2; //AUTO-UNBOXING
		Long l4 = l3; //AUTOBOXING (l3 primitive into l4 object)
		
		Integer num3 = Integer.valueOf(345);
		//Double dl3 = num3 Cant convert (cast) with wrapper classes
		
		
		
	}
}
