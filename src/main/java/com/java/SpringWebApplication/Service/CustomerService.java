package com.java.SpringWebApplication.Service;

import org.springframework.stereotype.Service;

import com.java.SpringWebApplication.DAO.Customers;
@Service
public interface CustomerService {
	Customers createCustomer(Customers customer);
	Customers getCustomer(int cust_id);
	public void addCustomer(Customers customer);
	Customers updateCustomer(Customers customer);
	void deleteCustomer(int cust_id);
	
       
}
