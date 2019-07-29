package com.hikex.htemplate.model;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import io.swagger.annotations.ApiModelProperty;

@Entity
@Table(name = "country")
public class CountryModel extends BaseEntity {

	@ApiModelProperty(notes = "Two digits country ISO code.")
	@NotNull
	private String isoCode;

	@ApiModelProperty(notes = "Country name.")
	private String name;

	public String getIsoCode() {
		return isoCode;
	}

	public void setIsoCode(String isoCode) {
		this.isoCode = isoCode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
