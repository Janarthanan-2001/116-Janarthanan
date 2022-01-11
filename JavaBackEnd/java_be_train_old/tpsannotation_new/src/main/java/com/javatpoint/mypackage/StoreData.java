package com.javatpoint.mypackage;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class StoreData {

	public static void main(String args[])
	{
		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
	    Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
		
		SessionFactory factory=meta.getSessionFactoryBuilder().build();
		Session session=factory.openSession();
		
		 Transaction t=session.beginTransaction();  
		 
		 	SavingAc sa=new SavingAc();
		 	sa.setAccountId("s101");
		 	sa.setAcHoldetName("vikram");
		 	sa.setInterest(100.00);
		 		
		 	CurrentAc ca=new CurrentAc();
		 	ca.setAccountId("s102");
		 	ca.setAcHoldetName("malik");
		 	ca.setSalary(4000);
		 	
		    session.persist(sa);  
		    session.persist(ca);  
		      
		    t.commit();  
		    session.close();  
		    System.out.println("success");  	
	}
}