package com.hikex.htemplate.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hikex.htemplate.dto.BlogData;

@RestController
@RequestMapping(value = "/api/users/{userid}/blogs")
public class BlogController extends BaseController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	private List<BlogData> getBlogs() {
		List<BlogData> blogs = new ArrayList<>();
		BlogData bd1 = new BlogData();
		bd1.setTitle("This is the sample data 1");
		bd1.setDescription(
				"Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum");
		blogs.add(bd1);

		BlogData bd2 = new BlogData();
		bd2.setTitle("This is the sample data 2");
		bd2.setDescription(
				"Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum");
		blogs.add(bd2);

		return blogs;

	}

	@RequestMapping(value = "/{blogid}", method = RequestMethod.GET)
	private BlogData getBlog(@PathVariable(value = "blogid") String blogid) {
		BlogData bd = new BlogData();
		bd.setTitle("This is the sample data");
		bd.setDescription(
				"Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum");

		return bd;

	}
}
