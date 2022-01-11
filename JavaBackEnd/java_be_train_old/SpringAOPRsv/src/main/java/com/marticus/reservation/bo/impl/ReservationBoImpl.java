package com.marticus.reservation.bo.impl;

import com.marticus.reservation.bo.ReservationBo;

public class ReservationBoImpl implements ReservationBo {

	public void addPatient() {
		// TODO Auto-generated method stub
		System.out.println(" addPatient() is running ");
	}

	public String addPatientReturnValue() {
		// TODO Auto-generated method stub
		System.out.println(" addPatientReturnValue() is running ");
		return "abc";
	}

	public void addPatientThrowException() throws Exception {
		// TODO Auto-generated method stub
		System.out.println(" addPatientThrowException() is running ");
		throw new Exception("Generic Error");
	}

	public void addPatientAround(String name) {
		// TODO Auto-generated method stub
		System.out.println(" addPatientAround() is running, args : " + name);
	}
}
