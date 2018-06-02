package org.wecancodeit.high_st_hospital;

public class Doctor extends Employee implements MedicalDuties {
	
	private String specialty;
	
	public Doctor(String empNumber) {
		super(empNumber);
	}

	public Doctor(String empNumber, String specialty) {
		super(empNumber);
		this.specialty = specialty;
	}

	public int calculatePay() {
		return 90000;		
	}

	public String getSpecialty() {
		return specialty;
	}
	
	
} // End Doctor()
