package br.com.ivia.querydsl.repository;

import javax.ejb.Stateless;

import br.com.ivia.querydsl.model.Customer;
import br.com.ivia.querydsl.model.QCustomer;

@Stateless
public class CustomerRepositoryImpl extends GenericRepositoryImpl<Customer> implements CustomerRepository {

	private QCustomer customer = QCustomer.customer;

	@Override
	public Customer findByFirstName(String firstName) {
		return from(customer)
				.where(customer.firstName.equalsIgnoreCase(firstName))
				.uniqueResult(customer);
	}

	@Override
	public Customer save(Customer customer) {
		em.persist(customer);
		return customer;
	}
}
