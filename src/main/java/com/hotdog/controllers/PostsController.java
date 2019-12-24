package com.hotdog.controllers;

import com.hotdog.entities.Info;
import com.hotdog.entities.Posts;
import com.hotdog.repositories.PostsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


import java.util.Map;

@Controller
public class PostsController {

    @Autowired
    private PostsRepo postsRepo;

//    @GetMapping("posts/all")
//    public @ResponseBody Iterable<Posts> getAllPosts() {
//
//        return postsRepo.findAll();
//    }

    @GetMapping(path = "posts/all")
    public String allPosts(Map<String, Object> model){
        Iterable<Posts> allPosts = postsRepo.findAll();
        model.put("ps", allPosts);
        return "posts/all";
    }

    @GetMapping("/posts")
    public String postForm(){
        return "posts";
    }

    @PostMapping("/posts")
    public String add(@RequestParam String pstName, @RequestParam String pstText, Map<String, Object> model)
    {
        Posts p = new Posts();

        p.setPostName(pstName);
        p.setPostText(pstText);

        postsRepo.save(p);

        return "redirect:/all";
    }




}
