package com.hikex.htemplate.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
import org.hibernate.validator.constraints.Length;

import io.swagger.annotations.ApiModelProperty;

@Entity
@Table(name = "state")
public class StateModel extends BaseEntity {

	@ApiModelProperty(notes = "Name of state")
	private String name;

	@ApiModelProperty(notes = "Two digits state ISO code")
	@NotNull
	@Length(min = 2, max = 2)
	private String isoCode;

	@ApiModelProperty(notes = "Address Model")
	@OneToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "addressId", nullable = false)
	@OnDelete(action = OnDeleteAction.CASCADE)
	private AddressModel address;

	public AddressModel getAddress() {
		return address;
	}

	public void setAddress(AddressModel address) {
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIsoCode() {
		return isoCode;
	}

	public void setIsoCode(String isoCode) {
		this.isoCode = isoCode;
	}

}
