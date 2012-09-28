package br.com.ivia.querydsl.fachada;

import br.com.ivia.querydsl.model.dto.CustomerDTO;

public interface FachadaQueryDsl {
	CustomerDTO findCustomerByFirstName(String firstName);
}
