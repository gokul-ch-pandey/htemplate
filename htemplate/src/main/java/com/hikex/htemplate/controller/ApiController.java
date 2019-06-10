package com.hikex.htemplate.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api")
public class ApiController {

	@RequestMapping(value = "/hello")
	public String helloWorld() {
		return "hello world";
	}

}
