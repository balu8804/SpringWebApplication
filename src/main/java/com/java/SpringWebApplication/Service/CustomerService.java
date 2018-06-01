package com.java.SpringWebApplication.Service;

import com.java.SpringWebApplication.DAO.Customers;

public interface CustomerService {
	Customers createUser(Customers customer);
	Customers getCustomer(int cust_id);
	Customers updateCustomer(Customers customer);
	void deleteCustomer(int cust_id);
	
       
}
