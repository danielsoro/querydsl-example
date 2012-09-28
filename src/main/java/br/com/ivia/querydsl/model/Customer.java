package br.com.ivia.querydsl.model;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Customer extends Model{
	private String firstName;
	private String lastName;
	@OneToOne
	@JoinColumn(name = "phone_id", referencedColumnName = "id")
	private Phone phone;
	
	public Customer() {
	}

	public Customer(String firstName) {
		super();
		this.firstName = firstName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Phone getPhone() {
		return phone;
	}

	public void setPhone(Phone phone) {
		this.phone = phone;
	}
}
