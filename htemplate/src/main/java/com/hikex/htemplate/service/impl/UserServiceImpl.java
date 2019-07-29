package com.hikex.htemplate.service.impl;

import java.util.Collection;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import com.hikex.htemplate.model.CustomerModel;
import com.hikex.htemplate.repository.UserRepository;
import com.hikex.htemplate.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public Optional<Collection<CustomerModel>> findUserByUsername(String email) {
		Assert.notNull(email, "email cannot be null.");
		Collection<CustomerModel> list = userRepository.findByEmail(email);
		return Optional.ofNullable(list);
	}

	@Override
	public String addUser(CustomerModel customer) {
		Assert.notNull(customer, "Customer cannot be null.");
		CustomerModel savedUser = userRepository.save(customer);
		return null != savedUser ? savedUser.getUsername() : null;
	}

	@Override
	public void removeUser(CustomerModel customer) {
		Assert.notNull(customer, "Customer cannot be null.");
		userRepository.delete(customer);
	}

}
