package com.java.SpringWebApplication.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.java.SpringWebApplication.DAO.Customers;

@RestController
@RequestMapping("/customer")
public class CustomerController {
	@RequestMapping(method = RequestMethod.POST)
	public Customers createCustomer() {
		return null;

	}

}
