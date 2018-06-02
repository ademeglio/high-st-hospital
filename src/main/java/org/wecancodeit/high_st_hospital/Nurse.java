package org.wecancodeit.high_st_hospital;

public class Nurse extends Employee implements MedicalDuties{

	private int numPatients;

	// Constructor
	public Nurse(String empNumber, int numPatients) {
		super(empNumber);
		this.numPatients = numPatients;
	}
	
	// Getters
	public int getNumPatients() {
		return numPatients;
	}
	
	public int calculatePay() {
		return 50000;		
	}

	public void administerCare(Patient patient) {
		patient.increaseHealth();
	}

} // End Nurse()
