package com.hdfc.project.repository;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.hdfc.project.entity.Customer;
@Repository
public interface CustomerRepo extends MongoRepository<Customer, Long> {

	public Customer findByCustomerEmail(String email); 


}
