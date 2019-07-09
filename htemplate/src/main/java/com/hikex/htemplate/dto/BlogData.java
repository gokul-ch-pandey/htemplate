package com.hikex.htemplate.dto;

import java.util.List;

public class BlogData {

	private String title;

	private String description;

	private UserData author;

	List<BlogSegmentData> segments;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public UserData getAuthor() {
		return author;
	}

	public void setAuthor(UserData author) {
		this.author = author;
	}

	public List<BlogSegmentData> getSegments() {
		return segments;
	}

	public void setSegments(List<BlogSegmentData> segments) {
		this.segments = segments;
	}

}
