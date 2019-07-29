package com.hikex.htemplate.service;

import java.util.Collection;
import java.util.Optional;

import com.hikex.htemplate.model.CustomerModel;

public interface UserService {

	Optional<Collection<CustomerModel>> findUserByUsername(String username);

	String addUser(CustomerModel customer);

	void removeUser(CustomerModel customer);

}
