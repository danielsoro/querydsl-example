package br.com.ivia.querydsl.model.dto;

public class CustomerDTO {
	private String firstName;
	
	public CustomerDTO() {
	}
	
	public CustomerDTO(String firstName) {
		this.firstName = firstName;
	}
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
}
