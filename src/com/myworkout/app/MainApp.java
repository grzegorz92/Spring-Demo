package com.myworkout.app;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		
		/* App will return proper workout according to the chosen sport (proper class in XML file).
		 * Depending on the selected sport, additional data such as age, weight or height etc.
		 * can be taken into account to prepare appropriate workout. 
		 * 
		 */

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Workout workout = context.getBean("myWorkout", Workout.class);
		
		System.out.println(workout.getWorkout());
		
		context.close();
		
					
	}

}


