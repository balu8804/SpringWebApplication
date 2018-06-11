package com.java.SpringWebApplication.Controller;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.MediaType;


import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.java.SpringWebApplication.Service.CustomerServiceImpl;
import com.java.SpringWebApplication.Controller.CustomerController;
import com.java.SpringWebApplication.DAO.Customers;

@ComponentScan(basePackages = "com.java.SpringWebApplication")
@Controller
@RequestMapping("/customer")
//@Path("/customer")
public class CustomerController {
	public static Session session;
	public static Response response=null;

	Logger logger = LoggerFactory.getLogger(CustomerController.class);
	@Autowired
	CustomerServiceImpl customerServiceImpl;
	
	@RequestMapping(value="/create",method = RequestMethod.POST, produces= {MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})

	public Response createCustomer(@RequestBody Customers customers) {
		try {
			session = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory().openSession();
			Transaction transaction = session.beginTransaction();
			customerServiceImpl.createCustomer(customers);
			session.save(customers);
			session.persist(customers);
			session.save(customers);
			transaction.commit();
			session.close();
			logger.info("This is the customer Controller class");
			response= Response.status(200).entity(customers).build();

		} catch (NullPointerException e) {
			logger.error("error in file");
		}
		return response;
	}

	@RequestMapping(value = "/getCustomer", method = RequestMethod.GET)
	public String getCustomer(@RequestBody Customers customers) {
		return "hello";
	}

	@RequestMapping(value = "/update", method = RequestMethod.PUT)
	public String updateCustomer() {
		return null;
	}

	@RequestMapping(value = "/delete", method = RequestMethod.DELETE)
	public String deleteCustomer() {
		return null;
	}

}
