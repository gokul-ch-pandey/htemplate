package com.hikex.htemplate.controller;


import java.security.Principal;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;


import com.hikex.htemplate.dto.UserData;


@RestController
@RequestMapping(value = "/api")
@Api(value="HTemplate SWAGGER API")
public class ApiController extends BaseController{

	@ApiOperation(value="API for hello")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Success")})
	@RequestMapping(value = "/hello")
		@RequestMapping(value = "/hello", produces = "application/json")
	public UserData helloWorld(Principal user) {
	return dataMapper.map(user, UserData.class);
	}
}