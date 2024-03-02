package com.example.demo.serviceImpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Customer;
import com.example.demo.repo.RegRepo;
import com.example.demo.service.IRegService;
@Service
public class CusomerImpl implements IRegService{

	@Autowired
	private RegRepo regrepo;
	
	
	@Override
	public int createCustomer(Customer c) {
		regrepo.save(c);
		return c.getCid();
	}

	@Override
	public Customer getCustomerById(Integer cid) {
		Optional<Customer> c=regrepo.findById(cid);
		Customer customer=c.get();
		return customer;
	}
	
	

}
