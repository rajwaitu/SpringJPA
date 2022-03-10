package com.techrocking.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.techrocking.entity.Post;
import com.techrocking.exception.PostNotFoundException;
import com.techrocking.payloads.Comment;
import com.techrocking.payloads.PostRequest;
import com.techrocking.payloads.PostResponse;
import com.techrocking.repository.PostRepository;
import com.techrocking.service.IPostService;
import com.techrocking.util.ServiceConstants;

@Service
public class PostServiceImpl implements IPostService {
	
	@Autowired
	private PostRepository postRepository;

	@Override
	public PostResponse getPost(Long id) {
		Optional<Post> postEntityOtional = postRepository.findById(id);
		
		if(!postEntityOtional.isPresent()) {
			PostNotFoundException exc = new PostNotFoundException(ServiceConstants.POST_NOT_FOUND_ERROR, HttpStatus.NOT_FOUND);
			throw exc;
		}
		
		Post postEntity = postEntityOtional.get();
		
		/*
		 * the conversion from post entity to post response can be done 
		 * in different component
		 */
		
		PostResponse response =  new PostResponse();
		response.setId(postEntity.getId());
		response.setTitle(postEntity.getTitle());
		response.setDescription(postEntity.getDescription());
		response.setAuthor(postEntity.getAuthor().getName());
		// set tags
		// set comments
		
		return response;
	}

	@Override
	public PostResponse createPost(PostRequest post,Long authorId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PostResponse updatePost(Long id, PostRequest post) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deletePost(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Comment createComment(Comment comment) {
		// TODO Auto-generated method stub
		return null;
	}


}
