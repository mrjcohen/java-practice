package day44_constructors02;

import java.util.*;

public class Dice {
	public static void main(String[] args) {
		Job job1 = new Job();
		Job job2 = new Job("Java Developer");
		Job job3 = new Job("SDET" , "Amazon" , 130_000);
		
		System.out.println(job1.toString());
		System.out.println(job2.toString());
		System.out.println(job3.toString());
		
		//Create a list of Jobs and add 5 different jobs
		//with company, salary, and title
		
		//ArrayList of Jobs
		List<Job> jobList = new ArrayList<>();
		jobList.add(job3);
		//Constructors allows use to create new object directly in the
		// .add method of arrayList
		jobList.add(new Job("Scrum Master" , "google" , 123_000));
		jobList.add(new Job("SDET" , "FreddieMac" , 115_000));
		jobList.add(new Job("BA" , "Leidos" , 98000));
		jobList.add(new Job("Senior QA Testor" , "Delta" , 150_000));
		
		//prints using the toString method and prints even the ones
		// we added before the arrayList
		System.out.println(jobList);
		
		//Find highest paying job and print toString
		double maxSalary = 0;
		int highestIndex = -1;
		for (int i = 0 ; i < jobList.size() ;  i++) {
			if(jobList.get(i).getAnnualSalary() > maxSalary) {
				maxSalary = jobList.get(i).getAnnualSalary();
				highestIndex = i;
			}
		}
		Job bestJob = jobList.get(highestIndex);
		System.out.println("Highest Salary is: "+bestJob.toString());
		
		
		
		
		
		
		
		
		
		
	}
}
