package com.hikex.htemplate.security;

import org.springframework.context.annotation.Bean;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity
public class WebSecurity extends WebSecurityConfigurerAdapter {

	@Bean
	@Override
	protected AuthenticationManager authenticationManager() throws Exception {
		return super.authenticationManager();
	}

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication().withUser("admin").password("{noop}nimda").roles("USER").and().withUser("akash")
				.password("{noop}abcd123").roles("CUSTOMER");
	}

	@Override
	public void configure(org.springframework.security.config.annotation.web.builders.WebSecurity web)
			throws Exception {
		web.ignoring().antMatchers("/swagger-ui.html","/webjars/**","/v2/api-docs", 
	            "/swagger-resources/**");
	}

}
