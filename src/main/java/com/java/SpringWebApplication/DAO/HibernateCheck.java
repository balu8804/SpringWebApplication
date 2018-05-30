package com.java.SpringWebApplication.DAO;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HibernateCheck {
	public static Session session;

	public static void main(String[] args) {
		
		 session=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory().openSession();
		Transaction transaction=session.beginTransaction();
		Customers customer=new Customers();
		//customer.setCust_id(1);
		customer.setFirst_Name("balasubramanyam");
		customer.setLast_Name("Lanka");
		session.persist(customer);
		transaction.commit();
		
		
		session.close();
		
		System.out.println("user saved successfully");

	}

}
