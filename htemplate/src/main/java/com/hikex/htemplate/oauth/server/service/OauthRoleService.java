package com.hikex.htemplate.oauth.server.service;

import java.util.List;

import com.hikex.htemplate.oauth.server.entity.Role;

public interface OauthRoleService {

	List<Role> findRoleByName(String name);

}
