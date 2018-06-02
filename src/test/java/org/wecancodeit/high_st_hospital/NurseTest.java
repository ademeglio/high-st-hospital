package org.wecancodeit.high_st_hospital;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class NurseTest {

		Nurse testNurse;
		Nurse testNurse2;
		Patient testPatient;
		
		@Before
		public void setUp() {
			testNurse = new Nurse("1235", 6);
			testNurse2 = new Nurse("1237", 3);
			testPatient = new Patient();
		}
		
		@Test
		public void shouldBeAbleToDrawBlood() {
			// setup
			int patientBloodStart = testPatient.getBloodLevel();
			// Act
			testNurse.drawBlood(testPatient);
			int patientBloodEnd = testPatient.getBloodLevel();
			
			// Assert
			assertEquals(patientBloodStart - 5, patientBloodEnd);
		}
		
		@Test
		public void shouldBePaid50k() {
			testNurse.calculatePay();
			assertEquals(testNurse.calculatePay(), 50000);
		}
		
		@Test
		public void shouldhavePatient() {
			// Setup
			int numPatients = testNurse.getNumPatients();
			int numPatients2 = testNurse2.getNumPatients();
			// Act
			
			// Assert
			assertThat(6, is(numPatients));
			assertThat(3, is(numPatients2));
		}
		
		@Test
		public void shouldCareForPatients() {
			// Setup
			int healthLevelBefore = testPatient.getHealthLevel();
			
			// Act
			testNurse.administerCare(testPatient);
			int healthLevelAfter = testPatient.getHealthLevel();
			
			// Assert
			assertEquals(healthLevelBefore + 10, healthLevelAfter);
		}
		

}