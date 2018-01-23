package com.myworkout.app;

import java.util.Scanner;

public class SwimmingWorkout implements Workout {

	private SWFileReading val = new SWFileReading();
	private Scanner sc = new Scanner(System.in);
	private String value;

	@Override
	public String getWorkout() {

		
		System.out.println("Are you pro or beginner swimmer?"); 
		System.out.println("Type \"1\", \"b\", or \"beginner\" if you are beginner.");
		System.out.println("Type \"2\", \"p\", or \"pro\" if you are pro: ");
		
		
	do {
		String question = sc.nextLine();
		
		switch(question) {
		
		case "1":
			value = val.beginnerSwimmer();
			break;
		case "b":
			value =  val.beginnerSwimmer();
			break;
		case "beginner":
			value =  val.beginnerSwimmer();
			break;
		case "2":	
			value =  val.proSwimmer();
			break;
		case "p":	
			value =  val.proSwimmer();
			break;
		case "pro":	
			value =  val.proSwimmer();
			break;
		default:
			System.out.println("Unrecognized command. Please try again:");
				
		}
		
	} while (value == null);
	
		return value;
		
	}

}
