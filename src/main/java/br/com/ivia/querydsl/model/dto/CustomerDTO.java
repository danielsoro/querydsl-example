package br.com.ivia.querydsl.model.dto;

public class CustomerDTO {
	private String firstName;
	private PhoneDTO phoneDTO;

	public CustomerDTO() {
	}

	public CustomerDTO(String firstName) {
		this.firstName = firstName;
	}

	public CustomerDTO(String firstName, String phoneNumber) {
		this.firstName = firstName;
		this.phoneDTO = new PhoneDTO(phoneNumber);
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public PhoneDTO getPhoneDTO() {
		return phoneDTO;
	}

	public void setPhoneDTO(PhoneDTO phoneDTO) {
		this.phoneDTO = phoneDTO;
	}
}
