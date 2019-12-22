package com.hotdog.controllers;

import com.hotdog.entities.Posts;
import com.hotdog.repositories.PostsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Map;

@Controller
public class PostsController {

    @Autowired
    private PostsRepo postsRepo;

    @GetMapping("/posts")
    public String postForm(){
        return "posts";
    }

    @PostMapping("/posts")
    public String addPost(Posts pst){

        postsRepo.save(pst);
        return "posts";
    }


}
