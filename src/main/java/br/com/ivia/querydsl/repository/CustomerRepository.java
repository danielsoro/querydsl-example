package br.com.ivia.querydsl.repository;

import br.com.ivia.querydsl.model.Customer;

public interface CustomerRepository {
	Customer findByFirstName(String firstName);
	Customer save(Customer customer);
}
