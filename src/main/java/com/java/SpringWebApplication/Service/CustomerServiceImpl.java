package com.java.SpringWebApplication.Service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.SpringWebApplication.DAO.Customers;

@Service
public class CustomerServiceImpl implements CustomerService {
	Logger logger = LoggerFactory.getLogger(CustomerServiceImpl.class);
	@Autowired
	Customers customers;

	public Customers createCustomer(Customers customer) {
		try {
			customer.setCust_id(customers.getCust_id());
			customer.setCreated(customers.getCreated());
			customer.setModified(customers.getModified());
			customer.setName(customers.getName());
			customers.setFirst_Name(customers.getFirst_Name());
			customers.setLast_Name(customers.getLast_Name());
			customers.setState(customers.getState());
			customers.setEmail(customers.getEmail());
			customers.setBilling_Address_Line1(customers.getBilling_Address_Line1());
			customers.setBilling_City(customers.getBilling_City());
			customers.setBilling_State(customers.getBilling_State());
			customers.setBilling_Country(customers.getBilling_Country());

		} catch (NullPointerException ex) {

		}

		return null;
	}

	public Customers getCustomer(int cust_id) {
		return null;
	}

	public Customers updateCustomer(Customers customer) {
		return null;
	}

	public void deleteCustomer(int cust_id) {

	}

}
