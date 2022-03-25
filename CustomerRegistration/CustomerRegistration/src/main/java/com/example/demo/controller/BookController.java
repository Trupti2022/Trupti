package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/book")
public class BookController {
	
	
	@Autowired
	private FlightController fc;
	
	@Autowired
	private RegController regc;
	
	@GetMapping("/customer/{cid}")
	
	public ResponseEntity<?> searchCustomer(@PathVariable Integer cid)
	{
		ResponseEntity<?> resp=new ResponseEntity<>(regc.getCustomerById(cid),HttpStatus.OK);
		return resp;
		
	}
	
	@GetMapping("/flight/{flid}")
	public ResponseEntity<?> searchFlightById(@PathVariable Integer flid)
	{
		ResponseEntity<?> resp=new ResponseEntity<>(fc.getFlightById(flid),HttpStatus.OK);
		return resp;
	}
	
}
