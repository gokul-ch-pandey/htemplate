package com.hikex.htemplate.controller;

import java.security.Principal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hikex.htemplate.dto.UserData;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping(value = "/api")
@Api
public class ApiController extends BaseController {

	@ApiOperation(value = "Hello world", response = UserData.class)
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Successfully retrieved user"),
			@ApiResponse(code = 401, message = "You are not authorized to view the resource"),
			@ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
			@ApiResponse(code = 404, message = "The resource you were trying to reach is not found") })
	@GetMapping(value = "/hello", produces = "application/json")
	public UserData helloWorld(Principal user) {
		return dataMapper.map(user, UserData.class);
	}
}
