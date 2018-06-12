package com.java.SpringWebApplication.Service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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

	public Customers createCustomer(Customers cust) {
		
			  Set<Customers> customer=new HashSet<Customers>();
			  customers.setCust_id(cust.getCust_id());
			  customers.setCreated(cust.getCreated());
			  customers.setModified(cust.getModified());
			  customers.setName(cust.getName());
			  customers.setFirst_Name(cust.getFirst_Name());
			  customers.setLast_Name(cust.getLast_Name());
			  customers.setState(cust.getState());
			  customers.setEmail(cust.getEmail());
			  customers.setBilling_Address_Line1(cust.getBilling_Address_Line1());
			  customers.setBilling_City(cust.getBilling_City());
			  customers.setBilling_State(cust.getBilling_State());
			  customers.setBilling_Country(cust.getBilling_Country());
			  customer.add(customers);
			  
              return  customers;


		
	}

	public Customers getCustomer(int cust_id) {
		return null;
	}

	public Customers updateCustomer(Customers customer) {
		return null;
	}

	public void deleteCustomer(int cust_id) {

	}

	@Override
	public void addCustomer(Customers customer) {
		
		 final List<Customers> customers=new ArrayList<Customers>();
			customers.add(customer);
	}

}
