package com.example.demo.service;

import com.example.demo.Entity.Flight;

public interface IFlightService {
	
	public int createFlight(Flight flight);
	public Flight searchFlightById(Integer flid);

}
