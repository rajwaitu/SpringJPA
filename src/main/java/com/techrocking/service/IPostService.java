package com.techrocking.service;

import com.techrocking.payloads.Comment;
import com.techrocking.payloads.PostRequest;
import com.techrocking.payloads.PostResponse;

public interface IPostService {
	
	public PostResponse getPost(Long id);
	
	public PostResponse createPost(PostRequest post, Long authorId);
	
	public PostResponse updatePost(Long id, PostRequest post);
	
	public void deletePost(Long id);
	
	public Comment createComment(Comment comment);
	
	//CRUD for Author
	//CRUD for Tag
	//CRUD for Comment

}
