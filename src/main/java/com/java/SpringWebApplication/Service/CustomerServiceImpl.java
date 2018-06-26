package com.java.SpringWebApplication.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.java.SpringWebApplication.DAO.Customers;

@Service
public class CustomerServiceImpl implements CustomerService {
	public static Session session;

	Logger logger = LoggerFactory.getLogger(CustomerServiceImpl.class);
	@Autowired
	Customers customers;
	
	public Customers createCustomer(@RequestBody AddCustomerRequest cust_req) {
		logger.info("From service class entered values are: " + cust_req.getCust_id() + cust_req.getName()
		+ cust_req.getFirst_Name() + cust_req.getState() + cust_req.getLast_Name()
		+ cust_req.getFirst_Name() + cust_req.getEmail() + cust_req.getPhone()
		+ cust_req.getBilling_Address_Line1() + cust_req.getBilling_City()
		+ cust_req.getBilling_State() + cust_req.getBilling_Postal_Code()
		+ cust_req.getBilling_Country());
		
		 session=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory().openSession();
		Transaction transaction=session.beginTransaction();

		
		//customers.setCust_id(cust_req.getCust_id());
		//customers.setCreated(cust_req.getCreated());
		customers.setModified(cust_req.getModified());
		customers.setName(cust_req.getName());
		customers.setFirst_Name(cust_req.getFirst_Name());
		customers.setLast_Name(cust_req.getLast_Name());
		customers.setState(cust_req.getState());
		customers.setEmail(cust_req.getEmail());
		customers.setBilling_Address_Line1(cust_req.getBilling_Address_Line1());
		customers.setBilling_City(cust_req.getBilling_City());
		customers.setBilling_State(cust_req.getBilling_State());
		customers.setBilling_Country(cust_req.getBilling_Country());
		session.save(customers);
		session.persist(customers);
		session.save(customers);
		transaction.commit();
		session.close();
		logger.info("user saved successfully");
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
