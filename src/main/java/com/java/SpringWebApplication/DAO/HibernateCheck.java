package com.java.SpringWebApplication.DAO;

import java.util.Date;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.java.SpringWebApplication.Service.CustomerServiceImpl;

import jdk.internal.jline.internal.Log;

public class HibernateCheck {
	
	Logger logger = LoggerFactory.getLogger(HibernateCheck.class);

	public static Session session;

	public static void main(String[] args) {
		Date date=new Date();
		
		 session=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory().openSession();
		Transaction transaction=session.beginTransaction();

		Customers customers=new Customers();
		//customers.setCust_id(1);
		customers.setCreated(date);
		customers.setModified(date);
		customers.setName("Balasubramanyam Lanka");
		customers.setFirst_Name("balasubramanyam");
		customers.setLast_Name("Lanka");
		customers.setState("Active");
		customers.setEmail("balasubramanyam.lanka@gmail.com");
		customers.setBilling_Address_Line1("15256 Stonebriar way");
		customers.setBilling_City("Orlando");
		customers.setBilling_State("FLorida");
		customers.setBilling_Country("USA");
		session.save(customers);
		session.persist(customers);
		session.save(customers);
		transaction.commit();
		session.close();
		Log.info("user saved successfully");
		//System.out.println("user saved successfully");

	}

}
