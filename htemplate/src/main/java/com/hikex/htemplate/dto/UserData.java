package com.hikex.htemplate.dto;

public class UserData {

	private String name;

	private boolean authenticated;

	private boolean clientOnly;

	private String credentials;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isAuthenticated() {
		return authenticated;
	}

	public void setAuthenticated(boolean authenticated) {
		this.authenticated = authenticated;
	}

	public boolean isClientOnly() {
		return clientOnly;
	}

	public void setClientOnly(boolean clientOnly) {
		this.clientOnly = clientOnly;
	}

	public String getCredentials() {
		return credentials;
	}

	public void setCredentials(String credentials) {
		this.credentials = credentials;
	}

}
