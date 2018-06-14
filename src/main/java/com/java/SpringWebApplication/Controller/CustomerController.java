package com.java.SpringWebApplication.Controller;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.hibernate.Session;
import org.apache.log4j.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.java.SpringWebApplication.Service.AddCustomerRequest;
import com.java.SpringWebApplication.Service.CustomerServiceImpl;
import com.java.SpringWebApplication.Controller.CustomerController;

@ComponentScan(basePackages = "com.java.SpringWebApplication")
@Controller
@RequestMapping("/customer")
public class CustomerController {
	public static Session session;
	public static Response response = null;

	private static final Logger logger = Logger.getLogger(CustomerController.class);
	@Autowired
	CustomerServiceImpl customerServiceImpl;
	@Autowired
	AddCustomerRequest cust_req;

	@RequestMapping(value="/create",method = RequestMethod.POST, produces={MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML},
			consumes={MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public Response createCustomer(@RequestBody AddCustomerRequest cust_req) {
		logger.info("controller class");
		customerServiceImpl.createCustomer(cust_req);
		logger.info("This is the customer Controller class");
		response=Response.status(Status.OK).build();
		return response;
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
