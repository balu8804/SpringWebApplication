package com.java.SpringWebApplication.Service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.ws.rs.core.MediaType;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.xml.bind.Marshaller;


import com.java.SpringWebApplication.DAO.Customers;

@Service
public class CustomerServiceImpl implements CustomerService {
	Logger logger = LoggerFactory.getLogger(CustomerServiceImpl.class);
	Marshaller marshal;
	@Autowired
	Customers customers;
		
	//@RequestMapping(value="/createcustomer", method = RequestMethod.POST, produces={MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML},
			//consumes={MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	@PostMapping(path="/createcustomer", consumes="application/json")
	@ResponseStatus(HttpStatus.CREATED)
	public Customers createCustomer(@RequestBody AddCustomerRequest cust_req) {
		
			  Set<Customers> customer=new HashSet<Customers>();
			  customers.setCust_id(cust_req.getCust_id());
			  customers.setName(cust_req.getName());
			  customers.setFirst_Name(cust_req.getFirst_Name());
			  customers.setLast_Name(cust_req.getLast_Name());
			  customers.setState(cust_req.getState());
			  customers.setEmail(cust_req.getEmail());
			  customers.setBilling_Address_Line1(cust_req.getBilling_Address_Line1());
			  customers.setBilling_City(cust_req.getBilling_City());
			  customers.setBilling_State(cust_req.getBilling_State());
			  customers.setBilling_Country(cust_req.getBilling_Country());
			  customer.add(customers);
			 
              return  customers;
              
  			//logger.debug(String.format("Received request: %s", JAXBUtility.marshal(cust_req)));



		
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
