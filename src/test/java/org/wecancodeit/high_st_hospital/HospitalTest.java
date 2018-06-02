package org.wecancodeit.high_st_hospital;


import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class HospitalTest {
	Hospital underTest;
	Doctor testDoc;
	Nurse testNurse;
	
	@Before
	public void setUp() {
		underTest = new Hospital();
		testDoc = new Doctor("1234", "Neurology");
		testNurse = new Nurse("1235", 3);
	}
	
	@Test
	public void shouldBeAbleToAddStaff() {
		// Arrange
		
		// Act
		int staffCountBefore = underTest.staffSize();
		underTest.addStaff(testDoc);
		
		// Assert
		assertEquals(staffCountBefore + 1, underTest.staffSize());
	}
	
	@Test
	public void shouldBeAbleToAddDifferentKindsOfEmployees() {
		// Arrange

		// Act
		underTest.addStaff(testDoc);
		underTest.addStaff(testNurse);
		
		// Assert
		assertThat(testDoc, instanceOf(Employee.class));
		assertThat(testDoc, instanceOf(Employee.class));
	}
	
	@Test
	public void shouldBeAbleToGetEmployeesByEmpNumber() {
		// Arrange
		
		// Act
		underTest.addStaff(testDoc);
		underTest.addStaff(testNurse);
		
		Employee hiredDoc = underTest.getStaffByNumber(testDoc.getNumber());
		Employee hiredNurse = underTest.getStaffByNumber(testNurse.getNumber());
		
		// Assert
		assertNotEquals(testDoc.getNumber(), testNurse.getNumber());
		assertEquals(testDoc.getNumber(), hiredDoc.getNumber());
		assertEquals(testNurse.getNumber(), hiredNurse.getNumber());
	}
	
	
} // End of HospitalTest()
