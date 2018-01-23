package com.myworkout.app;

public class TrackWorkout implements Workout {

	private RandomTrackWorkout rtw;
	
	public void setRandomWokrout(RandomTrackWorkout rtw) {
		this.rtw=rtw;
	}
	
	
	@Override
	public String getWorkout() {
		
		return rtw.getRandomWorkout();
	}

}
