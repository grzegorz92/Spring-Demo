package com.myworkout.app;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomTrackWorkout {
	
	
	List<String> list = new ArrayList<>();
	Random random = new Random();	
	
	
	public String getRandomWorkout() {
		
		list.add("Run 2 km with constant speed");
		list.add("Run interval for 20 minutes: 2 min sprint, 3 min fast walk");
		list.add("Jog for 30 minutes");
		
		String index = list.get(random.nextInt(list.size()));
		
		return index;
	}

}
