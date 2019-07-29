package com.hikex.htemplate.oauth.server.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="permission")
public class Permission extends BaseIdEntity {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
