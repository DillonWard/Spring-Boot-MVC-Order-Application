package com.sales.services;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sales.models.Customer;
import com.sales.repositories.CustomerRepos;

@Service("CustomerService")
public class CustomerService {

	@Autowired
	private CustomerRepos custRepos;
	
	public Customer save(Customer cust){
		
		return custRepos.save(cust);		
	} // save a new customer
	
	public ArrayList<Customer> getCustomers(){
		
		return (ArrayList<Customer>) custRepos.findAll();
	} // returns all the customers
}