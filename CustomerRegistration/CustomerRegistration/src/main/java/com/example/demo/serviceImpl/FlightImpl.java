package com.example.demo.serviceImpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Flight;
import com.example.demo.repo.FlightRepo;
import com.example.demo.service.IFlightService;
@Service
public class FlightImpl implements IFlightService {
	
	@Autowired
	private FlightRepo flightrepo;

	@Override
	public int createFlight(Flight flight) {
		flightrepo.save(flight);
		return flight.getFlid();
	}

	@Override
	public Flight searchFlightById(Integer flid) {
		Optional<Flight> f=flightrepo.findById(flid);
		Flight flight=f.get();
		return flight;
	}
	
	

}
