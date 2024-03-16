package com.pavansai.joblisting.repository;

import com.pavansai.joblisting.model.Post;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PostRepository extends MongoRepository<Post, String> {

}
