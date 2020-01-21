package com.hotdog.controllers;


import com.hotdog.entities.Posts;
import com.hotdog.entities.Tags;
import com.hotdog.entities.User;
import com.hotdog.repositories.PostsRepo;
import com.hotdog.repositories.TagsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;


import java.io.File;
import java.io.IOException;
import java.util.*;
import java.util.function.Consumer;

@Controller
public class PostsController {

    private final PostsRepo postsRepo;
    private final TagsRepo tagsRepo;


    public PostsController(PostsRepo postsRepo, TagsRepo tagsRepo) {
        this.postsRepo = postsRepo;
        this.tagsRepo = tagsRepo;
    }




    @Value("${upload.path}")
    private String uploadPath;

    @GetMapping(path = "posts/all")
    public String allPosts(Map<String, Object> model){
        Iterable<Posts> allPosts = postsRepo.findAll();
        Iterable<Tags> allTags = tagsRepo.findAll();


        model.put("ps", allPosts);
        model.put("postTags", allTags);
        return "posts/all";
    }

    @GetMapping("/posts")
    public String postForm(){
        return "posts";
    }

    @PostMapping("/posts")
    public String add(@RequestParam String pstName,
                      @RequestParam String pstText,
                      @RequestParam("file") MultipartFile file,
                      @AuthenticationPrincipal User user,
                      @RequestParam String tagStr
    ) throws IOException {

        Posts p = new Posts();



        if(file != null){
            File uploadDir = new File(uploadPath);
            if (!uploadDir.exists()){
                uploadDir.mkdirs();
            }

            String uuidFile = UUID.randomUUID().toString();

            String resultFileName = uuidFile + "." + file.getOriginalFilename();

            p.setImgName(resultFileName);
            file.transferTo(new File(uploadPath + "/" + resultFileName));
        }

        p.setPostName(pstName);
        p.setPostText(pstText);
        p.setAuthor(user);

        String[] splitTags = tagStr.split(",");


        for (String tempSplitTags : splitTags){
            Tags tags = new Tags(tempSplitTags);
            p.getTags().add(tags);
            tags.getPosts().add(p);
            tagsRepo.save(tags);
            postsRepo.save(p);
        }

        return "redirect:/posts/all";
    }

}
