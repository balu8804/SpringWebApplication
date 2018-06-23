package com.java.SpringWebApplication.Controller;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import org.hibernate.Session;
import org.apache.log4j.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;


import com.java.SpringWebApplication.Service.AddCustomerRequest;
import com.java.SpringWebApplication.Service.CustomerServiceImpl;
import com.java.SpringWebApplication.Controller.CustomerController;

@ComponentScan(basePackages = "com.java.SpringWebApplication")
@RestController
@RequestMapping("/customer")
public class CustomerController {
	public static Session session;
	public static Response response = null;

	private static final Logger logger = Logger.getLogger(CustomerController.class);
	@Autowired
	CustomerServiceImpl customerServiceImpl;
	@Autowired
	AddCustomerRequest cust_req;

	//@RequestMapping(value="/create", method = RequestMethod.POST, produces={MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML},
			//consumes={MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	@PostMapping(path="/create", consumes="application/json")
	@ResponseStatus(HttpStatus.CREATED)
	public Response createCustomer(@RequestBody AddCustomerRequest cust_req) {
		logger.info("controller class");
		customerServiceImpl.createCustomer(cust_req);
		
		logger.info("This is the customer Controller class");
		//response=Response.status(Status.OK).entity(arg0);
		return response;
	}
	@RequestMapping(value="/hello")
	public String addCustomer()
      {
		  logger.info("Hello");
		return "hello";
    	  
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
