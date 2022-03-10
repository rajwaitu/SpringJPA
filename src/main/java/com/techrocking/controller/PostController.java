package com.techrocking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.techrocking.payloads.PostRequest;
import com.techrocking.payloads.PostResponse;
import com.techrocking.service.IPostService;

@RestController
@RequestMapping("/v1/api/post")
public class PostController {
	
	@Autowired
	IPostService postService;

	@GetMapping("/{id}")
	PostResponse getPost(@PathVariable Long id) {
		return postService.getPost(id);
	}
	
	@PostMapping("/author/{id}")
	PostResponse createPost(@RequestBody PostRequest req,@PathVariable Long authorId) {
        return postService.createPost(req,authorId);
    }
	
	// update post
	// delete post
	//create comment
	//create author
	//create tag

}
