package com.hotdog.controllers;

import com.hotdog.repositories.PostsRepo;
import com.hotdog.repositories.TagsRepo;
import org.springframework.stereotype.Controller;

@Controller
public class TagsController {

    private final TagsRepo tagsRepo;
    public TagsController(TagsRepo tagsRepo) {
        this.tagsRepo = tagsRepo;
    }


}
