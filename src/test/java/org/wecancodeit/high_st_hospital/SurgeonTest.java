package org.wecancodeit.high_st_hospital;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class SurgeonTest {

	Surgeon testSurgeon;
	Surgeon testSurgeon2;
	
	@Before
	public void setUp() {
		testSurgeon = new Surgeon("4321", "Neurology", false);
		testSurgeon2 = new Surgeon("4322", "Pediatrics", true);
	} 
	
	@Test
	public void shouldBeADoctor () {
		// Assert
		assertThat (testSurgeon, instanceOf(Doctor.class));
	}
	
	@Test
	public void shouldBePaid120K () {
		assertEquals(testSurgeon.calculatePay(), 120000);
	}
	
	@Test
	public void shouldReturnOperatingStatus() {
		boolean isOperating1 = testSurgeon.isOperating();
		boolean isOperating2 = testSurgeon2.isOperating();
		assertEquals(false, isOperating1);
		assertEquals(true, isOperating2);
	}
}
