package day40_customclasses_methods;

public class Employee {
	
	public String name;		//can be used anywhere in the project "public"
	public String jobTitle;	//can be used anywhere in the project "public"
	Double salary;			//can only be used in the package "not public"
	
	
	public void work() {
		System.out.println(name+" is working hard ... ");
	}
	
	public void goToBreak() {
		System.out.println(name+" is on a break");
	}
	
	public void attendMeeting() {
		System.out.println(name+" is attending a meeting ... ");
	}
	
	public void introduct() {
		System.out.println("Name["+name+"], jobTitle["+jobTitle+"], salary["+salary+"]");
	}
	
}
