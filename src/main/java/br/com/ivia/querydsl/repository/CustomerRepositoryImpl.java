package br.com.ivia.querydsl.repository;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.com.ivia.querydsl.model.Customer;
import br.com.ivia.querydsl.model.QCustomer;

import com.mysema.query.jpa.impl.JPAQuery;

@Stateless
public class CustomerRepositoryImpl implements CustomerRepository {

	@PersistenceContext
	private EntityManager em;

	@Inject
	private JPAQuery jpaQuery;

	@Override
	public Customer findByFirstName(String firstName) {
		QCustomer customer = QCustomer.customer;

		return jpaQuery.from(customer)
				.where(customer.firstName.equalsIgnoreCase(firstName))
				.uniqueResult(customer);
	}

	@Override
	public Customer save(Customer customer) {
		em.persist(customer);
		return customer;
	}
}
