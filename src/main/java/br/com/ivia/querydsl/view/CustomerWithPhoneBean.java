package br.com.ivia.querydsl.view;

import javax.annotation.PostConstruct;
import javax.enterprise.inject.Produces;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.ivia.querydsl.fachada.FachadaQueryDsl;
import br.com.ivia.querydsl.model.dto.CustomerDTO;

public class CustomerWithPhoneBean {
	@Inject
	private FachadaQueryDsl fachadaQueryDsl;
	private CustomerDTO customerDTO;

	@PostConstruct
	public void initDto() {
		customerDTO = fachadaQueryDsl.fidCustomerWithPhoneByFirstName("Daniel");
	}

	public CustomerDTO findCustomerByFirstName(String firstName) {
		return fachadaQueryDsl.findCustomerByFirstName(firstName);
	}
	
	@Produces
	@Named
	public CustomerDTO getCustomerDTO() {
		return customerDTO;
	}

	public void setCustomerDTO(CustomerDTO customerDTO) {
		this.customerDTO = customerDTO;
	}
}
