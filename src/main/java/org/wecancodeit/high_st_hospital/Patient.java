package org.wecancodeit.high_st_hospital;

public class Patient {
	private static final int DEFAULT_BLOOD_LEVEL = 20;
	private static final int DEFAULT_HEALTH_LEVEL = 10;
	private int bloodLevel = DEFAULT_BLOOD_LEVEL;
	private int healthLevel = DEFAULT_HEALTH_LEVEL;
	
	// Getters
	public int getBloodLevel() {;
		return bloodLevel;
	}
	
	public int getHealthLevel() {
		return healthLevel;
	}
	
	
	// Methods
	public void drainBlood() {
		bloodLevel -= 5;
	}

	public void increaseHealth() {
		healthLevel += 10;
	}


} // End Patient()


