package com.marticus.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.marticus.auth.Authenticate;
import com.marticus.reservation.bo.ReservationBo;


public class App {
	public static void main(String[] args) throws Exception {

		ApplicationContext appContext = new ClassPathXmlApplicationContext("Spring-Reservation.xml");

		
//		ReservationBo patient = (ReservationBo) appContext.getBean("reserve");
//		patient.addPatient();
		
		Authenticate authRevs = (Authenticate) appContext.getBean("auth");
	
		authRevs.checkin();
		authRevs.checkout();
	}
}