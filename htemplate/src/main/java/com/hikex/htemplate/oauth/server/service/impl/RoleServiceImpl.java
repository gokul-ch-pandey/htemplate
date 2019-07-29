package com.hikex.htemplate.oauth.server.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hikex.htemplate.oauth.server.entity.Role;
import com.hikex.htemplate.oauth.server.repository.OauthRoleRepository;
import com.hikex.htemplate.oauth.server.service.OauthRoleService;

@Service(value = "oauthRoleService")
public class RoleServiceImpl implements OauthRoleService {

	@Autowired
	private OauthRoleRepository oauthRoleRepository;

	@Override
	public List<Role> findRoleByName(String name) {
		return oauthRoleRepository.findAllByName(name);
	}

}
