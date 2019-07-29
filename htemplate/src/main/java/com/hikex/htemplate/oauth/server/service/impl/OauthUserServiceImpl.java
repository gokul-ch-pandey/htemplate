package com.hikex.htemplate.oauth.server.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import com.hikex.htemplate.oauth.server.entity.User;
import com.hikex.htemplate.oauth.server.repository.OauthUserRepository;
import com.hikex.htemplate.oauth.server.service.OauthUserService;

@Service(value = "oauthUserService")
public class OauthUserServiceImpl implements OauthUserService {

	@Autowired
	private OauthUserRepository oauthUserRepository;

	@Override
	public String saveUser(User user) {
		Assert.notNull(user, "User cannot be null");
		User existingModel = oauthUserRepository.findByUsername(user.getUsername());
		if (null == existingModel) {
			oauthUserRepository.save(user);
			return "success";
		}
		return "failure";
	}

}
