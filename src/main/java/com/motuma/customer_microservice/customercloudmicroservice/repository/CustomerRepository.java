package com.motuma.customer_microservice.customercloudmicroservice.repository;

import com.motuma.customer_microservice.customercloudmicroservice.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long>{

	void deleteByCustomerNumber(Long customerNumber);
	Optional<Customer> findByCustomerNumber(Long customerNumber);
	void deleteByNationalCode(Long nationalCode);
	Optional<Customer> findByNationalCode(Long nationalCode);
}
