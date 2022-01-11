package com.marticus.main;
import java.util.HashSet;
import java.util.Set;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.marticus.util.HibernateUtil;
import com.marticus.dao.*;
public class AppTwo {
	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;
	try {
		transaction = session.beginTransaction();

		Set<CoachingCenter> coachingcenters = new HashSet<CoachingCenter>();
		coachingcenters.add(new CoachingCenter("maths center","MATHS"));
		coachingcenters.add(new CoachingCenter("physics center","physics"));
	
		Student3 student = new Student3("Eswar", coachingcenters);
		session.save(student);

		transaction.commit();
	} catch (HibernateException e) {
		transaction.rollback();
		e.printStackTrace();
	} finally {
		session.close();
		}
	
	}

}
