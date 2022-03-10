package com.techrocking.repository;

import org.springframework.data.repository.CrudRepository;

import com.techrocking.entity.Post;

public interface PostRepository  extends CrudRepository<Post, Long> {

}
