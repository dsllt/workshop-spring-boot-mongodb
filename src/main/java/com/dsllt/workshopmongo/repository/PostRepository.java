package com.dsllt.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.dsllt.workshopmongo.domain.Post;

public interface PostRepository extends MongoRepository<Post, String>{
  
}
