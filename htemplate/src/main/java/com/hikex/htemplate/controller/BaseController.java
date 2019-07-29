package com.hikex.htemplate.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.hikex.htemplate.pojo.mapper.DataMapper;

@Component
public class BaseController {

	@Resource(name = "dataMapper")
	protected DataMapper dataMapper;

}
