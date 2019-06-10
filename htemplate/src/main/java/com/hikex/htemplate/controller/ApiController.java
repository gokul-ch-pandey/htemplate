package com.hikex.htemplate.controller;

import java.security.Principal;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hikex.htemplate.dto.UserData;

@RestController
@RequestMapping(value = "/api")
public class ApiController extends BaseController {

	@RequestMapping(value = "/hello", produces = "application/json")
	public UserData helloWorld(Principal user) {

		return dataMapper.map(user, UserData.class);
	}

}
