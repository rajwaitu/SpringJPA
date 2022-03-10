package com.techrocking.payloads;

import java.util.List;

import lombok.Data;

@Data
public class PostRequest {
	private String title;
	private String description;
	private List<String> tags;
}
