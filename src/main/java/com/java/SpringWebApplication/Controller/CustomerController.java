package com.java.SpringWebApplication.Controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.java.SpringWebApplication.DAO.Customers;
import com.java.SpringWebApplication.Service.CustomerServiceImpl;
@ComponentScan(basePackages="com.java.SpringWebApplication")
@RestController
@RequestMapping("/customer")
public class CustomerController {
	@Autowired
	CustomerServiceImpl customerServiceImpl;
	Logger logger = LoggerFactory.getLogger(CustomerController.class);
	
	@PostMapping(value ="/create")
	@ResponseBody
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<Customers> createCustomer(@RequestBody Customers customers) {
		customerServiceImpl.createCustomer(customers);

		logger.info("This is the customer Controller class");
		return new ResponseEntity<Customers>(customers,HttpStatus.OK);

	}

}
