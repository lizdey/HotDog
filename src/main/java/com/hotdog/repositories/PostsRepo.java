package com.hotdog.repositories;

import com.hotdog.entities.Posts;
import org.springframework.data.repository.CrudRepository;

public interface PostsRepo extends CrudRepository<Posts, Long> {

}
