package com.example.demo.service;

import com.example.demo.Entity.Customer;

public interface IRegService {
	
	public int createCustomer(Customer c);
	public Customer getCustomerById(Integer cid);
	

}
