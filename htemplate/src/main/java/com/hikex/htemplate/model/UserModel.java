package com.hikex.htemplate.model;

import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;

@MappedSuperclass
public class UserModel extends BaseEntity {

	@NotBlank(message = "First name cannot be blank.")
	private String firstName;

	@NotBlank(message = "Last name cannot be blank.")
	private String lastName;

	@NotBlank(message = "Password cannot be blank.")
	private String password;

	private boolean disbled;

	private String username;

	private String mobile;

	@NotBlank(message = "Email cannot be blank.")
	@Column(unique = true)
	private String email;

	@OneToMany(fetch = FetchType.LAZY)
	@JoinColumn(name = "addressId")
	private Collection<AddressModel> addresses;

	public String getEmail() {
		return email;
	}

	public UserModel() {

	}

	public UserModel(String username, String email) {
		this.username = username;
		this.email = email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Collection<AddressModel> getAddresses() {
		return addresses;
	}

	public void setAddresses(Collection<AddressModel> addresses) {
		this.addresses = addresses;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isDisbled() {
		return disbled;
	}

	public void setDisbled(boolean disbled) {
		this.disbled = disbled;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

}
