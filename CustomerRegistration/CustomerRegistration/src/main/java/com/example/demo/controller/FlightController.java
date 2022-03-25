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

import com.example.demo.Entity.Flight;
import com.example.demo.service.IFlightService;

@RestController
@RequestMapping("/Flight")
public class FlightController {
	
	@Autowired
	private IFlightService flightservice;
	@PostMapping("/create")
	public ResponseEntity<?> createFlight(@RequestBody Flight f)
	{
		Integer id=flightservice.createFlight(f);
		ResponseEntity<?> resp=new ResponseEntity<>(id+"created",HttpStatus.OK);
		return resp;
		
	}
	
	@GetMapping("/{flid}")
	public ResponseEntity<Flight> getFlightById(@PathVariable Integer flid)
	{
		Flight f=flightservice.searchFlightById(flid);
		ResponseEntity<Flight> resp=new ResponseEntity<>(f,HttpStatus.OK);
		return resp;
		
	}
	

}
