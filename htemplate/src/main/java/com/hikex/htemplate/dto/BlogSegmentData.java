package com.hikex.htemplate.dto;

import java.sql.Blob;

public class BlogSegmentData {

	private String text;

	private String textCSS;

	private Blob media;

	private String mediaCSS;

	private int sequence;

	public int getSequence() {
		return sequence;
	}

	public void setSequence(int sequence) {
		this.sequence = sequence;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getTextCSS() {
		return textCSS;
	}

	public void setTextCSS(String textCSS) {
		this.textCSS = textCSS;
	}

	public Blob getMedia() {
		return media;
	}

	public void setMedia(Blob media) {
		this.media = media;
	}

	public String getMediaCSS() {
		return mediaCSS;
	}

	public void setMediaCSS(String mediaCSS) {
		this.mediaCSS = mediaCSS;
	}

}
