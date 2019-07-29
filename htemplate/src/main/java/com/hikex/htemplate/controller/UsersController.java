package com.hikex.htemplate.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hikex.htemplate.dto.UserData;
import com.hikex.htemplate.model.CustomerModel;
import com.hikex.htemplate.oauth.server.entity.Role;
import com.hikex.htemplate.oauth.server.entity.User;
import com.hikex.htemplate.oauth.server.service.OauthRoleService;
import com.hikex.htemplate.oauth.server.service.OauthUserService;
import com.hikex.htemplate.service.UserService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping(value = "api/users")
@Api(value = "Users Controller APIs")
public class UsersController extends BaseController {

	private static final String ROLE_USER = "role_user";

	@Autowired
	private UserService userService;

	@Autowired
	private OauthUserService oauthUserService;

	@Autowired
	private OauthRoleService oauthRoleService;

	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}

	@PostMapping(value = "/")
	@ApiOperation(value = "Create Customer", response = Iterable.class)
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Successfully created customer in the databse."),
			@ApiResponse(code = 401, message = "You are not authorized to view the resource"),
			@ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
			@ApiResponse(code = 404, message = "The resource you were trying to reach is not found") })
	public ResponseEntity<UserData> create(@Valid @RequestBody UserData userData) {
		CustomerModel customer = dataMapper.map(userData, CustomerModel.class);
		customer.setPassword(passwordEncoder().encode(userData.getPassword()));
		customer.setUsername(userData.getEmail());
		final String userName = userService.addUser(customer);
		if (null != userName) {
			String response = saveAuthorizationServerUser(customer);
			if (response.equalsIgnoreCase("success")) {
				return new ResponseEntity<UserData>(userData, HttpStatus.ACCEPTED);
			} else {
				userService.removeUser(customer);
			}
		}

		return new ResponseEntity<UserData>(userData, HttpStatus.CONFLICT);
	}

	private String saveAuthorizationServerUser(CustomerModel customer) {
		User user = new User();
		String response = null;
		List<Role> role = oauthRoleService.findRoleByName(ROLE_USER);
		if (null != role) {
			user.setPassword("{bcrypt}" + customer.getPassword());
			user.setEnabled(true);
			user.setUsername(customer.getEmail());
			user.setAccountNonExpired(false);
			user.setAccountNonLocked(false);
			user.setCredentialsNonExpired(false);
			user.setRoles(role);
			response = oauthUserService.saveUser(user);
		}
		return response;
	}
}
