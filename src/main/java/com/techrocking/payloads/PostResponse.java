package com.techrocking.payloads;

import java.util.List;

import lombok.Data;

@Data
public class PostResponse {
	private Long id;
	private String title;
	private String description;
	private String author;
	private List<String> tags;
	private List<Comment> comments;
}
