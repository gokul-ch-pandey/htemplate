package com.hikex.htemplate.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;

import com.hikex.htemplate.pojo.mapper.DataMapper;

@Controller
public class BaseController {

	@Resource(name = "dataMapper")
	protected DataMapper dataMapper;

}
