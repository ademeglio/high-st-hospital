package org.wecancodeit.high_st_hospital;

public class Surgeon extends Doctor {
	
	private boolean isOperating;

	public Surgeon(String empNumber, String specialty, boolean isOperating) {
		super(empNumber, specialty);
		this.isOperating = isOperating;
	}

	@Override
	public int calculatePay() {
		return 120000;
	}
	
	public boolean isOperating() {
		return isOperating;
	}
}
