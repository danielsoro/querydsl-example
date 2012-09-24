package br.com.ivia.querydsl.view;

import javax.annotation.PostConstruct;
import javax.enterprise.inject.Model;
import javax.enterprise.inject.Produces;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.ivia.querydsl.fachada.FachadaQueryDsl;
import br.com.ivia.querydsl.model.dto.CustomerDTO;

@Model
public class CustomerDtoBean {

	@Inject
	private FachadaQueryDsl fachadaQueryDsl;
	private CustomerDTO dto;

	@PostConstruct
	public void initDto() {
		dto = fachadaQueryDsl.findCustomerByFirstName("Daniel");
	}

	public CustomerDTO findCustomerByFirstName(String firstName) {
		return fachadaQueryDsl.findCustomerByFirstName(firstName);
	}

	@Produces
	@Named
	public CustomerDTO getDto() {
		return dto;
	}

	public void setDto(CustomerDTO dto) {
		this.dto = dto;
	}
}
