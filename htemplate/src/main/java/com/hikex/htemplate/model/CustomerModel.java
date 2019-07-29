package com.hikex.htemplate.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "customer")
public class CustomerModel extends UserModel {

	public CustomerModel() {
		super();
	}

	public CustomerModel(String username, String email) {
		super(username, email);
	}

}
