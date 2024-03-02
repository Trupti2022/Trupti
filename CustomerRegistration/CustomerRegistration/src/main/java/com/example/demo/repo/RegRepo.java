package com.example.demo.repo;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.Entity.Customer;

public interface RegRepo extends CrudRepository<Customer, Integer>{

}
