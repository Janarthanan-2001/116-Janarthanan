package com.marticus.reservation.bo;

public interface ReservationBo {
	
	void addPatient();
	
	String addPatientReturnValue();
	
	void addPatientThrowException() throws Exception;
	
	void addPatientAround(String name);

}
