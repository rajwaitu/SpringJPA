package com.techrocking.exception;

import org.springframework.http.HttpStatus;

public class PostNotFoundException extends RuntimeException{

	private static final long serialVersionUID = 1L;
	
	private HttpStatus status = null;

	public PostNotFoundException(String message, HttpStatus status) {
		super(message);
		this.status = status;
	}
	
	public HttpStatus getStatus() {
		return this.status;
	}

}
