package br.com.ivia.querydsl.fachada;

import javax.ejb.Stateless;
import javax.inject.Inject;

import br.com.ivia.querydsl.model.QCustomer;
import br.com.ivia.querydsl.model.dto.CustomerDTO;

import com.mysema.query.jpa.impl.JPAQuery;
import com.mysema.query.types.ConstructorExpression;

@Stateless
public class FachadaQueryDslImpl implements FachadaQueryDsl {

	@Inject
	private JPAQuery jpaQuery;

	@Override
	public CustomerDTO findCustomerByFirstName(String firstName) {
		QCustomer customer = QCustomer.customer;
		return jpaQuery
				.from(customer)
				.where(customer.firstName.equalsIgnoreCase(firstName))
				.uniqueResult(
						ConstructorExpression.create(CustomerDTO.class,
								customer.firstName));
	}

	@Override
	public CustomerDTO fidCustomerWithPhoneByFirstName(String firstName) {
		QCustomer customer = QCustomer.customer;

		return jpaQuery.from(customer).uniqueResult(
				ConstructorExpression.create(CustomerDTO.class,
						customer.firstName,customer.phone.number));
	}

}
