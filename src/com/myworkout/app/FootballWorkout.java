package com.myworkout.app;

public class FootballWorkout implements Workout {

	private String wrk;
	
	public FootballWorkout(String wrk) {
		this.wrk=wrk;
	}
	
	
	@Override
	public String getWorkout() {
		
		return wrk;
	}

}
