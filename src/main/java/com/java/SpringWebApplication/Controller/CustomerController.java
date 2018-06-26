package com.java.SpringWebApplication.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import org.hibernate.Session;
import org.apache.log4j.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
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

	@RequestMapping(value = "/create", method = RequestMethod.POST, produces = { MediaType.APPLICATION_JSON,
			MediaType.APPLICATION_XML }, consumes = { MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public Response createCustomer(@RequestBody AddCustomerRequest addCustomerRequest,
			@Context HttpServletRequest servletRequest) {
		logger.info("controller class");
         
		logger.info("From control class entered values are: " + addCustomerRequest.getCust_id() + addCustomerRequest.getName()
				+ addCustomerRequest.getFirst_Name() + addCustomerRequest.getState() + addCustomerRequest.getLast_Name()
				+ addCustomerRequest.getFirst_Name() + addCustomerRequest.getEmail() + addCustomerRequest.getPhone()
				+ addCustomerRequest.getBilling_Address_Line1() + addCustomerRequest.getBilling_City()
				+ addCustomerRequest.getBilling_State() + addCustomerRequest.getBilling_Postal_Code()
				+ addCustomerRequest.getBilling_Country());
		customerServiceImpl.createCustomer(addCustomerRequest);

		logger.info("user saved successfully");

		// response=Response.status(Status.OK).entity(data);
		return response;
	}

	@RequestMapping(value = "/hello")
	public String addCustomer(@RequestBody AddCustomerRequest cust_req) {
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
