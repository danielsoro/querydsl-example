package br.com.ivia.querydsl.fachada;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import br.com.ivia.querydsl.model.Customer;
import br.com.ivia.querydsl.model.dto.CustomerDTO;
import br.com.ivia.querydsl.repository.CustomerRepository;

@Stateless
public class FachadaQueryDslImpl implements FachadaQueryDsl {
	
	@EJB
	private CustomerRepository customerRepository;
	
	@Override
	public CustomerDTO findCustomerByFirstName(String firstName) {
		Customer customer = customerRepository.findByFirstName(firstName);
		
		if (customer != null)
			return new CustomerDTO(customer.getFirstName());
		return null;
	}
}
