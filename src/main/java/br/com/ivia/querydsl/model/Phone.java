package br.com.ivia.querydsl.model;

import javax.persistence.Entity;

@Entity
public class Phone extends Model {
	private String number;

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}
}
