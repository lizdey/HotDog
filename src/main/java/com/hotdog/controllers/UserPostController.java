package com.hotdog.controllers;

import com.hotdog.entities.Posts;
import com.hotdog.entities.User;
import com.hotdog.repositories.PostsRepo;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Set;

@Controller
public class UserPostController {
    private final PostsRepo postsRepo;
    public UserPostController(PostsRepo postsRepo) {
        this.postsRepo = postsRepo;
    }

    @GetMapping("/user-posts/{user}")
    public String userPosts(
            @AuthenticationPrincipal User currentUser,
            @PathVariable User user,
            Model model
    ){
        Set<Posts> posts = user.getPostsSet();
        model.addAttribute("ps", posts);
        return "userPosts";
    }
}
