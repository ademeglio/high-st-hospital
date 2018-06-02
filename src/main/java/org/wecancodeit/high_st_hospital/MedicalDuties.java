package org.wecancodeit.high_st_hospital;

public interface MedicalDuties {
	
	public default void drawBlood(Patient patient) {
		patient.drainBlood();
	}
} // End Interface MedicalDuties
