package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Customer;
import com.example.demo.service.IRegService;

@RestController
@RequestMapping("/Customer")
public class RegController {
	@Autowired
	private IRegService regservice;
	
	
	@PostMapping("/reg")
	public ResponseEntity<?> createCustomer(@RequestBody Customer c)
	{
		Integer id=regservice.createCustomer(c);
		ResponseEntity<?> resp=new ResponseEntity<>(id+"Created", HttpStatus.OK);
		return resp;
	}
	
	@GetMapping("/{cid}")
	public ResponseEntity<Customer> getCustomerById(@PathVariable Integer cid)
	{
		Customer c=regservice.getCustomerById(cid);
		ResponseEntity<Customer> resp=new ResponseEntity<>(c,HttpStatus.OK);
		return resp;
	}

}
