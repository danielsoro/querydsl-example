package br.com.ivia.querydsl.view;

import javax.annotation.PostConstruct;
import javax.enterprise.inject.Model;
import javax.enterprise.inject.Produces;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.ivia.querydsl.model.Customer;
import br.com.ivia.querydsl.repository.CustomerRepository;

@Model
public class CustomerListBean {
	
	@Inject
	private CustomerRepository customerRepository;
	private Customer customer;
	
	@PostConstruct
	public void initNewCustomer() {
		customer = findCustomerByFirstName("Daniel");
	}
	
	public Customer findCustomerByFirstName(String firstName) {
		return customerRepository.findByFirstName(firstName);
	}

	@Produces
	@Named
	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
}
