package org.wecancodeit.high_st_hospital;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class DoctorTest {

		Doctor testDoc;
		Doctor testDoc2;
		Patient testPatient;
		
		@Before
		public void setUp() {
			testDoc = new Doctor("1234","Neurology");
			testDoc2 = new Doctor("1236","Pediatrics");
			testPatient = new Patient();
		}
		
		@Test
		public void shouldBeAbleToDrawBlood() {
			// setup
			int patientBloodStart = testPatient.getBloodLevel();
			// Act
			testDoc.drawBlood(testPatient);
			int patientBloodEnd = testPatient.getBloodLevel();
			
			// Assert
			assertEquals(patientBloodStart - 5, patientBloodEnd);
		}
		
		@Test
		public void shouldBePaid90k() {
			testDoc.calculatePay();
			assertEquals(testDoc.calculatePay(), 90000);
		}
		
		@Test
		public void shouldHaveSpecialty() {
			// Setup
			
			String checkSpecialtyDoc1 = testDoc.getSpecialty();
			String checkSpecialtyDoc2 = testDoc2.getSpecialty();
			assertThat("Neurology", is(checkSpecialtyDoc1));
			assertThat("Pediatrics", is(checkSpecialtyDoc2));
		}
		
		
}
