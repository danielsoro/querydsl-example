package br.com.ivia.querydsl.repository;

import javax.ejb.Stateless;
import javax.inject.Inject;

import br.com.ivia.querydsl.model.Customer;
import br.com.ivia.querydsl.model.QCustomer;

import com.mysema.query.jpa.impl.JPAQuery;

@Stateless
public class CustomerRepositoryImpl implements CustomerRepository {
	@Inject
	private JPAQuery jpaQuery;

	@Override
	public Customer findByFirstName(String firstName) {
		QCustomer customer = QCustomer.customer;

		return jpaQuery.from(customer).where(customer.firstName.equalsIgnoreCase(firstName))
				.uniqueResult(customer);
	}
}
