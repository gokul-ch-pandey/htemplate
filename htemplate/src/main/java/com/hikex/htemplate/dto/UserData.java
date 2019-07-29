package com.hikex.htemplate.dto;

import javax.validation.constraints.NotBlank;

public class UserData {
	@NotBlank(message = "First name cannot be blank.")
	private String firstName;

	@NotBlank(message = "Last name cannot be blank.")
	private String lastName;

	@NotBlank(message = "Email cannot be blank.")
	private String email;

	@NotBlank(message = "Password cannot be blank.")
	private String password;

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
