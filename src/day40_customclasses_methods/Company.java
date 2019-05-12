package day40_customclasses_methods;

public class Company {
	public static void main(String[] args) {
		
		Employee emp1 = new Employee();
		emp1.name = "Kate";
		emp1.jobTitle = "Developer";
		emp1.salary = 115000.00;
		
		emp1.introduct();
		emp1.work();
		emp1.goToBreak();
		emp1.attendMeeting();
		
		//Changing object/instance variable
		emp1.jobTitle = "Team Lead";
		emp1.salary = 120500.2;
		
		emp1.introduct();
		
	}

}
