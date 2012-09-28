package br.com.ivia.querydsl.repository;

import br.com.ivia.querydsl.model.Customer;

public interface CustomerRepository extends GenericRepository<Customer>{
	Customer findByFirstName(String firstName);
}
