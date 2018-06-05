package com.java.SpringWebApplication.Controller;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.java.SpringWebApplication.Service.CustomerServiceImpl;
import com.java.SpringWebApplication.Controller.CustomerController;
import com.java.SpringWebApplication.DAO.Customers;



@ComponentScan(basePackages="com.java.SpringWebApplication")
@Controller
@RequestMapping("/customer")
public class CustomerController {
	public static Session session;
	

	
	Logger logger = LoggerFactory.getLogger(CustomerController.class);
	@Autowired
	CustomerServiceImpl customerServiceImpl;

	
	@ResponseBody
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(value="/create",method = RequestMethod.POST)
	public String createCustomer(@RequestBody Customers customers) {
		try {
			session=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory().openSession();
			Transaction transaction=session.beginTransaction();


		customerServiceImpl.createCustomer(customers);
		session.save(customers);
		session.persist(customers);
		session.save(customers);
		transaction.commit();
		session.close();
		logger.info("This is the customer Controller class");
		return "hello";
		
	}
		catch(NullPointerException  e)
		{
			logger.error("error in file");
		}
		return null;
	}
	
}
