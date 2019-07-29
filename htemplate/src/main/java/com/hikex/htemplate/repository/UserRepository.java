package com.hikex.htemplate.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hikex.htemplate.model.CustomerModel;

public interface UserRepository extends JpaRepository<CustomerModel, Long> {

	public List<CustomerModel> findByEmail(String email);
}
