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
import org.apache.log4j.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.java.SpringWebApplication.Service.CustomerServiceImpl;
import com.java.SpringWebApplication.Controller.CustomerController;
import com.java.SpringWebApplication.DAO.Customers;

@ComponentScan(basePackages = "com.java.SpringWebApplication")
@Controller
@RequestMapping("/customer")
// @Path("/customer")
public class CustomerController {
	public static Session session;
	public static Response response = null;

	private static final Logger logger = Logger.getLogger(CustomerController.class);
	@Autowired
	CustomerServiceImpl customerServiceImpl;
	@RequestMapping(value="/create",method = RequestMethod.POST)
	//@RequestMapping(value="/create",method = RequestMethod.POST, produces= {MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public void createCustomer(@RequestBody Customers customer) {
		logger.info("controller class");
           //customerServiceImpl.addCustomer(customer);
		logger.info("This is the customer Controller class");
	}

	@RequestMapping(value = "/get", method = RequestMethod.GET)
	public String getCustomer(@RequestParam(value = "id") String id) {
		System.out.println("This is the customer get method");
		logger.info("This is the customer get method");
		logger.info("Id is: " + id);
		return "balu";
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
