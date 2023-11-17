package com.motuma.customer_microservice.customercloudmicroservice.controller;

import com.motuma.customer_microservice.customercloudmicroservice.model.Customer;
import org.springframework.http.ResponseEntity;

public interface ICustomerController {
	ResponseEntity<Iterable<Customer>> getAllCustomers();
	ResponseEntity<Customer> getCustomerById(Long id);
	ResponseEntity<Customer> getByCustomerNumber(Long customerNumber);
	ResponseEntity<Customer> getByNationalCode(Long nationalCode);
	ResponseEntity<Customer> saveCustomer(Customer customer);
	ResponseEntity<Customer> updateCustomer(Customer customer);
	ResponseEntity<Customer> updateById(Customer customer, Long id);
	ResponseEntity<Customer> updateByCustomerNumber(Customer customer, Long customerNumber);
	ResponseEntity<Customer> updateByNationalCode(Customer customer, Long nationalCode);
	ResponseEntity<String> deleteCustomer(Customer customer);
	ResponseEntity<String> deleteByCustomerNumber(Long customerNumber);
	ResponseEntity<String> deleteById(Long id);
	ResponseEntity<String> deleteByNationalCode(Long nationalCode);
}
