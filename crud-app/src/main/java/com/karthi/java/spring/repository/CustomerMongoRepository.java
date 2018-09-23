package com.karthi.java.spring.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.karthi.java.spring.data.Customer;



public interface CustomerMongoRepository extends MongoRepository<Customer, String> {

//	Customer findOne(String id);

	

	//Customer findOne(String id);

	

}
