package com.hikex.htemplate.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping(value = "/api")
@Api(value="HTemplate SWAGGER API")
public class ApiController {

	@ApiOperation(value="API for hello")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Success")})
	@RequestMapping(value = "/hello")
	public String helloWorld() {
		return "hello world";
	}
}