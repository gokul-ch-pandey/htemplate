package com.hikex.htemplate.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
import org.hibernate.validator.constraints.Length;

import io.swagger.annotations.ApiModelProperty;

@Entity
@Table(name = "address")
public class AddressModel extends BaseEntity {

	@ApiModelProperty(notes = "Name of the city.")
	private String city;

	@ApiModelProperty(notes = "Six digit postal code of state.")
	@NotNull
	@Length(min = 6, max = 6)
	private String postalCode;

	@ApiModelProperty(notes = "State model.")
	@OneToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "stateCode", nullable = false)
	@OnDelete(action = OnDeleteAction.CASCADE)
	private StateModel state;

	@ApiModelProperty(notes = "Address Line 1.")
	private String addressLine1;

	@ApiModelProperty(notes = "Address Line 2.")
	private String addressLine2;

	@ApiModelProperty(notes = "If this is a default address.")
	private boolean defaultAddress;

	@ApiModelProperty(notes = "Two digits country ISO code.")
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "countryCode", nullable = false)
	@OnDelete(action = OnDeleteAction.CASCADE)
	private CountryModel country;

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public StateModel getState() {
		return state;
	}

	public void setState(StateModel state) {
		this.state = state;
	}

	public String getAddressLine1() {
		return addressLine1;
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public String getAddressLine2() {
		return addressLine2;
	}

	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}

	public boolean isDefaultAddress() {
		return defaultAddress;
	}

	public void setDefaultAddress(boolean defaultAddress) {
		this.defaultAddress = defaultAddress;
	}

	public CountryModel getCountry() {
		return country;
	}

	public void setCountry(CountryModel country) {
		this.country = country;
	}

}
