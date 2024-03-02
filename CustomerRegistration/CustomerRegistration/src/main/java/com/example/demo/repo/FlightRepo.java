package com.example.demo.repo;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.Entity.Flight;

public interface FlightRepo extends CrudRepository<Flight, Integer> {

}
