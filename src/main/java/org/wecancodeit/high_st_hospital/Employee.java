package org.wecancodeit.high_st_hospital;

public abstract class Employee {
	
	private String empNumber;
	
	// Constructor
	public Employee(String empNumber) {
		this.empNumber = empNumber;
	}
	
	// Getters
	public String getNumber() {
		return empNumber;
	}
	
	// Methods
	
	public abstract int calculatePay();

} // End Employee
