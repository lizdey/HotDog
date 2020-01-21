package com.hotdog.repositories;

import com.hotdog.entities.Posts;
import com.hotdog.entities.Tags;
import org.springframework.data.repository.CrudRepository;

public interface TagsRepo extends CrudRepository<Tags, Long> {

}
